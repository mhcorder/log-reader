package com.logdecoder.dto;

import java.io.Serializable;
import java.util.ArrayList;

public class AmbientesDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<ServidorDTO> servidores;

	
	public AmbientesDTO() {
		servidores = new ArrayList<ServidorDTO>();
		
	}
	
	public void agregarServidor(ServidorDTO s) {
		servidores.add(s);
	}

	
	public void eliminarServidor(ServidorDTO s) {
		servidores.remove(s);
	}

	public ArrayList<ServidorDTO> getServidores() {
		return servidores;
	}


	public void setServidores(ArrayList<ServidorDTO> servidores) {
		this.servidores = servidores;
	}
	
	
}
