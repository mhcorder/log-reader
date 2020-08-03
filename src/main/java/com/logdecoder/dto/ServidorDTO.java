package com.logdecoder.dto;

import java.io.Serializable;

public class ServidorDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String hostName;
	private int port;
	private String user;
	private String password;
	private String rutaLog;
	private String nombreLog;
	private String rutaDestino;
	private String nombreDestino;
	
	
	public ServidorDTO(String nombre, String hostName, int port, String user, String password, String rutaLog,
			String nombreLog, String rutaDestino, String nombreDestino) {
		this.nombre = nombre;
		this.hostName = hostName;
		this.port = port;
		this.user = user;
		this.password = password;
		this.rutaLog = rutaLog;
		this.nombreLog = nombreLog;
		this.rutaDestino = rutaDestino;
		this.nombreDestino = nombreDestino;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getHostName() {
		return hostName;
	}


	public void setHostName(String hostName) {
		this.hostName = hostName;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRutaLog() {
		return rutaLog;
	}


	public void setRutaLog(String rutaLog) {
		this.rutaLog = rutaLog;
	}


	public String getNombreLog() {
		return nombreLog;
	}


	public void setNombreLog(String nombreLog) {
		this.nombreLog = nombreLog;
	}


	public String getRutaDestino() {
		return rutaDestino;
	}


	public void setRutaDestino(String rutaDestino) {
		this.rutaDestino = rutaDestino;
	}


	public String getNombreDestino() {
		return nombreDestino;
	}


	public void setNombreDestino(String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}
	
}
