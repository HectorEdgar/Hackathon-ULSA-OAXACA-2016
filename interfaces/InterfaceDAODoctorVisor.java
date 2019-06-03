package modelo.interfaces;

import java.util.ArrayList;

import modelo.Caso;
import modelo.Doctor;
import modelo.DoctorVisor;
import modelo.Estado;

public interface InterfaceDAODoctorVisor {

	ArrayList<DoctorVisor> seleccionarDoctoresVisores();
	ArrayList<DoctorVisor> seleccionarDoctoresVisores(Doctor d);
	ArrayList<DoctorVisor> seleccionarDoctoresVisores(Caso c);
	ArrayList<DoctorVisor> seleccionarDoctoresVisores(Estado e);
	ArrayList<DoctorVisor> seleccionarDoctoresVisores(Doctor d, Caso c);
	DoctorVisor seleccionarDoctorVisor(int idDoctorVisor);
	
	int eliminarDoctorVisor(DoctorVisor d);
	int modificarDoctorVisor(DoctorVisor d);
	int insertarDoctorVisor(DoctorVisor d);
}
