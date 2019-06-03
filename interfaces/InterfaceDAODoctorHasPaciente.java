package modelo.interfaces;

import java.util.ArrayList;

import modelo.Doctor;
import modelo.DoctorHasPaciente;
import modelo.Estado;
import modelo.Paciente;

public interface InterfaceDAODoctorHasPaciente {
	ArrayList<DoctorHasPaciente> seleccionarDoctorHasPacientes();
	ArrayList<DoctorHasPaciente> seleccionarDoctorHasPacientes(Paciente p);
	ArrayList<DoctorHasPaciente> seleccionarDoctorHasPacientes(Doctor d);
	ArrayList<DoctorHasPaciente> seleccionarDoctorHasPacientes(Estado e);
	
	int eliminarDoctorHasPaciente (DoctorHasPaciente dhp);
	int modificarDoctorHasPaciente (DoctorHasPaciente dhps);
}
