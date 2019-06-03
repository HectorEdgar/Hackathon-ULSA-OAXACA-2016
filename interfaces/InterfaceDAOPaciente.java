package modelo.interfaces;

import java.util.ArrayList;

import modelo.Doctor;
import modelo.Estado;
import modelo.Paciente;

public interface InterfaceDAOPaciente {
	
	ArrayList<Paciente> seleccionarPacientes();
	Paciente seleccionarPaciente(int idPaciente);
	ArrayList<Paciente> seleccionarPacientes(Doctor d);
	ArrayList<Paciente> seleccionarPacientes(Estado e);
	
	int insertarPaciente(Paciente p);
	int modificarPaciente(Paciente p);
	int eliminarPaciente(Paciente p);
}
