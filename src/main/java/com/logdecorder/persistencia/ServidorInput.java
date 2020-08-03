package com.logdecorder.persistencia;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.logdecoder.dto.AmbientesDTO;
import com.logdecoder.dto.ServidorDTO;

public class ServidorInput {
	
	private FileInputStream file;
	private ObjectInputStream input;
	
	public void open() throws IOException {
		file = new FileInputStream("servidores.ser");
		input = new ObjectInputStream(file);
	}

	public void closed() throws IOException {
		if(input != null) {
			input.close();
		}
	}
	
	public AmbientesDTO read() {
		AmbientesDTO ambiente = new AmbientesDTO();
		
		if(input != null) {
			try {
				ambiente = (AmbientesDTO) input.readObject();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		return ambiente;
	}
	
}
