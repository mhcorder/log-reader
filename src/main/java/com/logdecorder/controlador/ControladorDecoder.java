package com.logdecorder.controlador;

import java.io.IOException;
import java.util.ArrayList;

import com.logdecoder.SSHConnector.SSHConnector;
import com.logdecoder.dto.AmbientesDTO;
import com.logdecoder.dto.ServidorDTO;
import com.logdecoder.gui.CreateServidorGUI;
import com.logdecoder.gui.ServidoresGUI;
import com.logdecorder.persistencia.ServidorInput;
import com.logdecorder.persistencia.ServidorOutput;

public class ControladorDecoder {
	
	private ServidorDTO s;
	private ServidorOutput output;
	private CreateServidorGUI createServidorGUI;
	private ServidorInput input;
	private AmbientesDTO ambiente;
	private ServidoresGUI guiServidores;
	private SSHConnector sshConnector;
	
	
	public ControladorDecoder(ServidoresGUI gui) {
		sshConnector = new SSHConnector();
		createServidorGUI = new CreateServidorGUI();
		output = new ServidorOutput();
		input = new ServidorInput();
		ambiente = new AmbientesDTO();
		guiServidores = gui;
		this.guiServidores.getBtnNuevo().addActionListener(a-> mostrarCrearServidor());
		this.createServidorGUI.getBtnGuardar().addActionListener(b->guardarServidor());
		this.guiServidores.getBtnGrabar().addActionListener(c->record());
		loadServers();
		loadComboServers();
	}


	private void record() {
		String nameServer = this.guiServidores.getComboBoxServidores().getSelectedItem().toString();
		ServidorDTO selectedServer = obtenerServidorXNombre(nameServer);
		try {
			sshConnector.connect(selectedServer.getUser(), selectedServer.getPassword(), selectedServer.getHostName(), selectedServer.getPort());
			String result = sshConnector.executeCommand("pwd");
			System.out.print(result.toString());
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}


	private ServidorDTO obtenerServidorXNombre(String server) {
		ServidorDTO am = null;
		for(int i = 0; i<ambiente.getServidores().size(); i++) {
			if(ambiente.getServidores().get(i).getNombre().equals(server)) {
				am = ambiente.getServidores().get(i);
			}
		}
		
		return am;
	}


	private void loadComboServers() {
		for(int i = 0; i<ambiente.getServidores().size(); i ++) {
			this.guiServidores.getComboBoxServidores().addItem(ambiente.getServidores().get(i).getNombre());
		}
		
	}


	private void loadServers() {
		try {
			input.open();
			ambiente = input.read();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
	}


	private void mostrarCrearServidor() {
		this.createServidorGUI.iniciarGUI();
	}


	private void guardarServidor() {
		String nombre = this.createServidorGUI.getTextFieldName().getText().toString();
		String hostName = this.createServidorGUI.getTextFieldNameHost().getText().toString();
		int puerto = Integer.parseInt(this.createServidorGUI.getTextFieldPort().getText().toString());
		String usuario = this.createServidorGUI.getTextFieldUser().getText().toString();
		String password = this.createServidorGUI.getTextFieldPassword().getText().toString();
		String rutaLog = this.createServidorGUI.getTextFieldRutaLog().getText().toString();
		String nombreLog = this.createServidorGUI.getTextFieldNameLog().getText().toString();
		String rutaDestino = this.createServidorGUI.getTextFieldRutaDestino().getText().toString();
		String nombreDestino = this.createServidorGUI.getTextFieldNombreDestino().getText().toString();
		s = new ServidorDTO(nombre, hostName, puerto, usuario, password, rutaLog, nombreLog, rutaDestino, nombreDestino);
		ambiente.agregarServidor(s);
		try {
			output.open();
			output.write(ambiente);
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
		
	}
	
}
