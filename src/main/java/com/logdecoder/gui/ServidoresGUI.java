package com.logdecoder.gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class ServidoresGUI {

	private JFrame frmServidoresGUI;
	private JComboBox<String> comboBoxServidores;
	private JButton btnGrabar;
	private JButton btnNuevo;
	private JButton btnEditar;

	

	/**
	 * Create the application.
	 */
	public ServidoresGUI() {
		initialize();
	}
	
	public void iniciar() {
		this.frmServidoresGUI.setVisible(true);
	}
	
	public void cerrar() {
		this.frmServidoresGUI.dispose();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmServidoresGUI = new JFrame();
		frmServidoresGUI.setTitle("Log Decoder");
		frmServidoresGUI.setBounds(100, 100, 620, 379);
		frmServidoresGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmServidoresGUI.getContentPane().setLayout(null);
		
		JLabel lblLogoHotel = new JLabel("LOGO HOTEL");
		lblLogoHotel.setBounds(10, 11, 79, 60);
		frmServidoresGUI.getContentPane().add(lblLogoHotel);

		JLabel lblPag = new JLabel("MENU PRINCIPAL");
		lblPag.setBounds(99, 11, 121, 14);
		frmServidoresGUI.getContentPane().add(lblPag);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 69, 584, 2);
		frmServidoresGUI.getContentPane().add(separator);

		JPanel footer = new JPanel();
		footer.setBounds(10, 308, 584, 24);
		footer.setBackground(Color.BLACK);
		frmServidoresGUI.getContentPane().add(footer);

		JLabel lblDerechosReservadosFull = new JLabel("Desarrollador por Team QC");
		lblDerechosReservadosFull.setForeground(Color.WHITE);
		footer.add(lblDerechosReservadosFull);

		JPanel body = new JPanel();
		body.setBounds(10, 82, 360, 47);
		body.setBorder(new LineBorder(new Color(0, 0, 0)));
		body.setBackground(Color.WHITE);
		frmServidoresGUI.getContentPane().add(body);
		body.setLayout(null);
		
		JLabel lblServidores = new JLabel("Servidores: ");
		lblServidores.setBounds(10, 11, 89, 14);
		body.add(lblServidores);
		
		comboBoxServidores = new JComboBox<String>();
		comboBoxServidores.setBounds(95, 8, 255, 20);
		body.add(comboBoxServidores);
		
		JPanel panel = new JPanel();
		panel.setBounds(380, 82, 214, 202);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		frmServidoresGUI.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDatosServidor = new JLabel("Datos");
		lblDatosServidor.setBounds(79, 11, 70, 14);
		panel.add(lblDatosServidor);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(10, 261, 89, 23);
		frmServidoresGUI.getContentPane().add(btnGrabar);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(150, 261, 89, 23);
		frmServidoresGUI.getContentPane().add(btnNuevo);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(280, 261, 89, 23);
		frmServidoresGUI.getContentPane().add(btnEditar);
	}

	public JFrame getFrmServidoresGUI() {
		return frmServidoresGUI;
	}

	public void setFrmServidoresGUI(JFrame frmServidoresGUI) {
		this.frmServidoresGUI = frmServidoresGUI;
	}

	public JComboBox<String> getComboBoxServidores() {
		return comboBoxServidores;
	}

	public void setComboBoxServidores(JComboBox<String> comboBoxServidores) {
		this.comboBoxServidores = comboBoxServidores;
	}

	public JButton getBtnGrabar() {
		return btnGrabar;
	}

	public void setBtnGrabar(JButton btnGrabar) {
		this.btnGrabar = btnGrabar;
	}

	public JButton getBtnNuevo() {
		return btnNuevo;
	}

	public void setBtnNuevo(JButton btnNuevo) {
		this.btnNuevo = btnNuevo;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}
	
	
}
