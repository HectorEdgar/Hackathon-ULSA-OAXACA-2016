package modelo.interfaces;

import java.util.ArrayList;

import modelo.Caso;
import modelo.Doctor;
import modelo.Paciente;

public interface InterfaceDAOCaso {
	
	ArrayList<Caso> seleccionarCasos();
	ArrayList<Caso> seleccionarCasos(Paciente p);
	ArrayList<Caso> seleccionarCasos(Doctor d);
	ArrayList<Caso> seleccionarCasos(Doctor d, Paciente p);
	Caso seleccionarCaso(int idCaso);
	
	int eliminarCaso(Caso c);
	int modificarCaso(Caso c);
	int insertarCaso(Caso c);
	
	
	ArrayList<Caso> crearListaCasoMySqlDataReader(DataReader dr);
}
