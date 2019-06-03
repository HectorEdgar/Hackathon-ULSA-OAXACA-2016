package modelo.interfaces;

import java.util.ArrayList;

import modelo.Caso;
import modelo.Doctor;
import modelo.DoctorActualizacion;

public interface InterfaceDAODoctorActualizacion {
	// SELECT
	DoctorActualizacion seleccionarDoctorActualizacion(int idDoctorActualizacion);
	
	ArrayList<DoctorActualizacion> seleccionarDoctorActualizaciones(Doctor d);
	ArrayList<DoctorActualizacion> seleccionarDoctorActualizaciones(Doctor d, Caso c);
	
	// INSERT
	int insertarDoctorActualizacion(DoctorActualizacion da);
	
	// UPDATE
	int modificarDoctorActualizacion(DoctorActualizacion da);
	
	// DELETE
	int eliminarDoctorActualizacion(DoctorActualizacion da);

}
