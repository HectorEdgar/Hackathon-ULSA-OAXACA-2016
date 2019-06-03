package modelo.interfaces;

import java.util.ArrayList;

import modelo.Actualizacion;
import modelo.Archivo;

public interface InterfaceDAOArchivo {

	ArrayList<Archivo> seleccionarArchivos();
	ArrayList<Archivo> seleccionarArchivo(Actualizacion actualizacion);
	
	Archivo seleccionarArchivo(int idArchivo);
	
	int insertarArchivo(Archivo archivo);
	int modificarArchivo(Archivo archivo);
	int eliminarArchivo(Archivo archivo);
}
