package modelo.interfaces;

import java.util.ArrayList;

import modelo.Caso;
import modelo.Doctor;
import modelo.DoctorColaborador;
import modelo.Estado;

public interface InterfaceDAODoctorColaborador {
	
	ArrayList<DoctorColaborador> seleccionarDoctoresColaboradores();
	ArrayList<DoctorColaborador> seleecionarDoctoresColaboradores(Doctor d);
	ArrayList<DoctorColaborador> seleecionarDoctoresColaboradores(Caso c);
	ArrayList<DoctorColaborador> seleecionarDoctoresColaboradores(Estado e);
	ArrayList<DoctorColaborador> seleecionarDoctoresColaboradores(Doctor d, Caso c);
	DoctorColaborador seleccionarDoctorColaborador(int idDoctorColaborador);
	
	int eliminarDoctorColaborador(DoctorColaborador d);
	int modificarDoctorColaborador(DoctorColaborador d);
	int insertarDoctorColaborador(DoctorColaborador d);
}
