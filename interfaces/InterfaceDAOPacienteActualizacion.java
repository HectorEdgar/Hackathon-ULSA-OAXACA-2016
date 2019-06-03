package modelo.interfaces;

import java.util.ArrayList;

import modelo.Actualizacion;
import modelo.Paciente;
import modelo.PacienteActualizacion;

public interface InterfaceDAOPacienteActualizacion {

	ArrayList<PacienteActualizacion> seleccionarPacientesActualizaciones();
	ArrayList<PacienteActualizacion> seleccionarPacientesActualizaciones(Paciente paciente);
	ArrayList<PacienteActualizacion> seleccionarPacientesActualizaciones(Actualizacion actualizacion);
	ArrayList<PacienteActualizacion> seleccionarPacientesActualizaciones(Actualizacion actualizacion,boolean isViewed);
	ArrayList<PacienteActualizacion> seleccionarPacientesActualizaciones(Paciente paciente,boolean isViewed);
	ArrayList<PacienteActualizacion> seleccionarPacientesActualizaciones(Paciente paciente,Actualizacion actualizacion);
	
	PacienteActualizacion seleccionarPacienteActualizacion(int idPacienteActulizacion);
	
	int insertarPacienteActualizacion(PacienteActualizacion pacienteActualizacion);
	int modificarPacienteActualizacion(PacienteActualizacion pacienteActualizacion);
	int eliminarPacienteActualizar(PacienteActualizacion pacienteActualizacion);
	
}
