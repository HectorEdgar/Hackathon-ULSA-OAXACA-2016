package modelo.interfaces;

import java.util.ArrayList;

import modelo.Actualizacion;
import modelo.Caso;

public interface InterfaceDAOActualizacion {

	ArrayList<Actualizacion> seleccionarActualizaciones(Caso c);
	ArrayList<Actualizacion> seleccionarActualizaciones();
	ArrayList<Actualizacion> seleccionarActualizaciones(Actualizacion actualizacion);
	Actualizacion seleccionarActualizacion(int idActualizacion);
	
	int insertarActualizacion(Actualizacion actualizacion);
	int modificarActualizacion(Actualizacion actualizacion);
	int eliminarActualizacion(Actualizacion actualizacion);
}
