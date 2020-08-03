package com.logdecoder.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateServidorGUI{

	private JFrame frameCreateServidorGUI;
	private JPanel contentPane;
	private JTextField textFieldNameHost;
	private JTextField textFieldPort;
	private JTextField textFieldName;
	private JTextField textFieldUser;
	private JTextField textFieldPassword;
	private JTextField textFieldRutaLog;
	private JTextField textFieldNameLog;
	private JTextField textFieldRutaDestino;
	private JTextField textFieldNombreDestino;
	private JButton btnGuardar;
	private JButton btnCancelar;
	
	
	
	public void iniciarGUI() {
		this.frameCreateServidorGUI.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public CreateServidorGUI() {
		this.frameCreateServidorGUI = new JFrame();
		this.frameCreateServidorGUI.setTitle("Log Decoder");
		this.frameCreateServidorGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frameCreateServidorGUI.setBounds(100, 100, 368, 322);
		
		frameCreateServidorGUI.getContentPane().setLayout(null);

		
		JLabel lblNameHost = new JLabel("NameHost: ");
		lblNameHost.setBounds(10, 52, 123, 14);
		frameCreateServidorGUI.getContentPane().add(lblNameHost);
		
		textFieldNameHost = new JTextField();
		textFieldNameHost.setBounds(143, 49, 198, 20);
		frameCreateServidorGUI.getContentPane().add(textFieldNameHost);
		textFieldNameHost.setColumns(10);
		
		JLabel lblPuerto = new JLabel("Port: ");
		lblPuerto.setBounds(10, 74, 123, 14);
		frameCreateServidorGUI.getContentPane().add(lblPuerto);
		
		textFieldPort = new JTextField();
		textFieldPort.setBounds(143, 71, 198, 20);
		frameCreateServidorGUI.getContentPane().add(textFieldPort);
		textFieldPort.setColumns(10);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setBounds(10, 30, 123, 14);
		frameCreateServidorGUI.getContentPane().add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(143, 27, 198, 20);
		frameCreateServidorGUI.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblUser = new JLabel("User: ");
		lblUser.setBounds(10, 96, 123, 14);
		frameCreateServidorGUI.getContentPane().add(lblUser);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(143, 93, 198, 20);
		frameCreateServidorGUI.getContentPane().add(textFieldUser);
		textFieldUser.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(10, 118, 123, 14);
		frameCreateServidorGUI.getContentPane().add(lblPassword);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(143, 115, 198, 20);
		frameCreateServidorGUI.getContentPane().add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		JLabel lblRutaLog = new JLabel("RutaLog: ");
		lblRutaLog.setBounds(10, 141, 123, 14);
		frameCreateServidorGUI.getContentPane().add(lblRutaLog);
		
		textFieldRutaLog = new JTextField();
		textFieldRutaLog.setBounds(143, 138, 198, 20);
		frameCreateServidorGUI.getContentPane().add(textFieldRutaLog);
		textFieldRutaLog.setColumns(10);
		
		JLabel lblNameLog = new JLabel("NameLog: ");
		lblNameLog.setBounds(10, 164, 123, 14);
		frameCreateServidorGUI.getContentPane().add(lblNameLog);
		
		textFieldNameLog = new JTextField();
		textFieldNameLog.setBounds(143, 161, 198, 20);
		frameCreateServidorGUI.getContentPane().add(textFieldNameLog);
		textFieldNameLog.setColumns(10);
		
		JLabel lblRutaDestino = new JLabel("RutaDestino: ");
		lblRutaDestino.setBounds(10, 186, 123, 14);
		frameCreateServidorGUI.getContentPane().add(lblRutaDestino);
		
		textFieldRutaDestino = new JTextField();
		textFieldRutaDestino.setBounds(143, 183, 198, 20);
		frameCreateServidorGUI.getContentPane().add(textFieldRutaDestino);
		textFieldRutaDestino.setColumns(10);
		
		JLabel lblNombreDestino = new JLabel("NombreDestino: ");
		lblNombreDestino.setBounds(10, 208, 123, 14);
		frameCreateServidorGUI.getContentPane().add(lblNombreDestino);
		
		textFieldNombreDestino = new JTextField();
		textFieldNombreDestino.setBounds(143, 205, 198, 20);
		frameCreateServidorGUI.getContentPane().add(textFieldNombreDestino);
		textFieldNombreDestino.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(10, 249, 89, 23);
		frameCreateServidorGUI.getContentPane().add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(252, 249, 89, 23);
		frameCreateServidorGUI.getContentPane().add(btnCancelar);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getTextFieldNameHost() {
		return textFieldNameHost;
	}

	public void setTextFieldNameHost(JTextField textFieldNameHost) {
		this.textFieldNameHost = textFieldNameHost;
	}

	public JTextField getTextFieldPort() {
		return textFieldPort;
	}

	public void setTextFieldPort(JTextField textFieldPort) {
		this.textFieldPort = textFieldPort;
	}

	public JTextField getTextFieldName() {
		return textFieldName;
	}

	public void setTextFieldName(JTextField textFieldName) {
		this.textFieldName = textFieldName;
	}

	public JTextField getTextFieldUser() {
		return textFieldUser;
	}

	public void setTextFieldUser(JTextField textFieldUser) {
		this.textFieldUser = textFieldUser;
	}

	public JTextField getTextFieldPassword() {
		return textFieldPassword;
	}

	public void setTextFieldPassword(JTextField textFieldPassword) {
		this.textFieldPassword = textFieldPassword;
	}

	public JTextField getTextFieldRutaLog() {
		return textFieldRutaLog;
	}

	public void setTextFieldRutaLog(JTextField textFieldRutaLog) {
		this.textFieldRutaLog = textFieldRutaLog;
	}

	public JTextField getTextFieldNameLog() {
		return textFieldNameLog;
	}

	public void setTextFieldNameLog(JTextField textFieldNameLog) {
		this.textFieldNameLog = textFieldNameLog;
	}

	public JTextField getTextFieldRutaDestino() {
		return textFieldRutaDestino;
	}

	public void setTextFieldRutaDestino(JTextField textFieldRutaDestino) {
		this.textFieldRutaDestino = textFieldRutaDestino;
	}

	public JTextField getTextFieldNombreDestino() {
		return textFieldNombreDestino;
	}

	public void setTextFieldNombreDestino(JTextField textFieldNombreDestino) {
		this.textFieldNombreDestino = textFieldNombreDestino;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	
}
