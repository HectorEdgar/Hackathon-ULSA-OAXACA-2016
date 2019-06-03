package modelo.interfaces;

import java.util.ArrayList;

import modelo.Alerta;
import modelo.Doctor;
import modelo.Paciente;

public interface InterfaceDAOAlerta {
	// SELECT
	Alerta seleccionarAlerta(int idAlerta);
	ArrayList<Alerta> seleccionarAlertas(Doctor d, Paciente p);
	
	ArrayList<Alerta> seleccionarAlertas(Paciente p);
	
	
	// INSERT
	int insertarAlerta(Alerta a);
	
	// UPDATE
	int modificarAlerta(Alerta a);
	
	// DELETE
	int eliminarAlerta(Alerta a);

}
