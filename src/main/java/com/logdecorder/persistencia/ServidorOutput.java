package com.logdecorder.persistencia;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.logdecoder.dto.AmbientesDTO;
import com.logdecoder.dto.ServidorDTO;

public class ServidorOutput {
	
	private FileOutputStream file;
	private ObjectOutputStream outout;
	
	
	public void open() throws IOException {
		file = new FileOutputStream("servidores.ser");
		outout = new ObjectOutputStream(file);
	}
	
	public void close() throws IOException {
		if(outout != null) {
			outout.close();
		}
	}
	
	public void write(AmbientesDTO s) throws IOException {
		if(outout != null) {
			outout.writeObject(s);
		}
	}

}
