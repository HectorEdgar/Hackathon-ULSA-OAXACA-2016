package modelo.interfaces;

import java.util.ArrayList;

import modelo.Estado;

public interface InterfaceDAOEstado {
	
	ArrayList<Estado> seleccionarEstados();
	ArrayList<Estado> seleccionarEstadoPorId(int idEstado);
}
