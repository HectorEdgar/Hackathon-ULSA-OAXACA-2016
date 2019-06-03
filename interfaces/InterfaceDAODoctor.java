package modelo.interfaces;

import java.util.ArrayList;

import modelo.Caso;
import modelo.Doctor;
import modelo.Paciente;

public interface InterfaceDAODoctor {
	// SELECTS
	Doctor seleccionarDoctor(int idDoctor);
	ArrayList<Doctor> seleccionarDoctores();
	
	ArrayList<Doctor> seleccionarDoctores(Paciente p);
	ArrayList<Doctor> seleccionarDoctoresVisores(Caso c);
	ArrayList<Doctor> seleccionarDoctoresColaboradores(Caso c);
	
	// INSERT
	int insertarDoctor(Doctor d);
	
	// UPDATE
	int modificarDoctor(Doctor d);
	
	// DELETE
	int eliminarDoctor(Doctor d);
}
