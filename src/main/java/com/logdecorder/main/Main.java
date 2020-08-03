package com.logdecorder.main;

import com.logdecoder.dto.AmbientesDTO;
import com.logdecoder.gui.CreateServidorGUI;
import com.logdecoder.gui.ServidoresGUI;
import com.logdecorder.controlador.ControladorDecoder;

public class Main {

	public static void main(String[] args) {
		ServidoresGUI gui = new ServidoresGUI();
		ControladorDecoder controlador = new ControladorDecoder(gui);
		gui.iniciar();

	}

}
