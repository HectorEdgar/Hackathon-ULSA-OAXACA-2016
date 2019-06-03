/*
Created		5/3/2017
Modified		5/4/2017
Project		
Model		
Company		
Author		
Version		
Database		mySQL 5 
*/


drop table IF EXISTS DoctorActualizacion;
drop table IF EXISTS PacienteActualizacion;
drop table IF EXISTS Archivo;
drop table IF EXISTS EstadoPaciente;
drop table IF EXISTS DoctorVisor;
drop table IF EXISTS DoctorColaborador;
drop table IF EXISTS Alertas;
drop table IF EXISTS Estado;
drop table IF EXISTS DoctorHasPacientes;
drop table IF EXISTS Caso;
drop table IF EXISTS Actualizacion;
drop table IF EXISTS Doctor;
drop table IF EXISTS Paciente;


Create table Paciente (
	idPaciente Int NOT NULL AUTO_INCREMENT,
	nombrePaciente Varchar(20) NOT NULL,
	apellidoPaternoPaciente Varchar(20) NOT NULL,
	apellidoMaternoPaciente Varchar(20) NOT NULL,
	fechaNacimientoPaciente Date NOT NULL,
	contrasena Varchar(70) NOT NULL,
 Primary Key (idPaciente)) ENGINE = MyISAM;

Create table Doctor (
	idDoctor Int NOT NULL AUTO_INCREMENT,
	cedulaProfesionalDoctor Varchar(7) NOT NULL,
	nombreDoctor Varchar(40) NOT NULL,
	apellidoPaternoDoctor Varchar(40) NOT NULL,
	apellidoMaternoDoctor Varchar(40) NOT NULL,
	especialidadDoctor Varchar(40) NOT NULL,
	dependenciaDoctor Varchar(500) NOT NULL,
	contrasena Varchar(70) NOT NULL,
	UNIQUE (cedulaProfesionalDoctor),
 Primary Key (idDoctor)) ENGINE = MyISAM;

Create table Actualizacion (
	idActualizacion Int NOT NULL AUTO_INCREMENT,
	idCaso Int NOT NULL,
	idActualizacionFK Int NOT NULL,
	fechaActualizacion Datetime NOT NULL,
	tituloActualizacion Varchar(50) NOT NULL,
	descripcionActualizacion Varchar(500) NOT NULL,
 Primary Key (idActualizacion)) ENGINE = MyISAM;

Create table Caso (
	idCaso Int NOT NULL AUTO_INCREMENT,
	motivoCaso Varchar(100) NOT NULL,
	fechaInicioCaso Date NOT NULL,
	fechaCierreCaso Date NOT NULL,
	idPaciente Int NOT NULL,
	idDoctor Int NOT NULL,
 Primary Key (idCaso)) ENGINE = MyISAM;

Create table DoctorHasPacientes (
	idPaciente Int NOT NULL,
	idDoctor Int NOT NULL,
	idEstado Int NOT NULL,
	idDoctorHasPaciente Int NOT NULL AUTO_INCREMENT,
 Primary Key (idDoctorHasPaciente)) ENGINE = MyISAM;

Create table Estado (
	idEstado Int NOT NULL AUTO_INCREMENT,
	descripcion Varchar(20) NOT NULL,
 Primary Key (idEstado)) ENGINE = MyISAM;

Create table Alertas (
	idDoctor Int NOT NULL,
	idPaciente Int NOT NULL,
	idEstadoPaciente Int NOT NULL,
	isViewed Bool NOT NULL DEFAULT false,
	fechaAlerta Datetime NOT NULL,
	idAlerta Int NOT NULL AUTO_INCREMENT,
 Primary Key (idAlerta)) ENGINE = MyISAM;

Create table DoctorColaborador (
	idDoctor Int NOT NULL,
	idEstado Int NOT NULL,
	idCaso Int NOT NULL,
	idDoctorColaborador Int NOT NULL AUTO_INCREMENT,
 Primary Key (idDoctorColaborador)) ENGINE = MyISAM;

Create table DoctorVisor (
	idDoctor Int NOT NULL,
	idCaso Int NOT NULL,
	idEstado Int NOT NULL,
	idDoctorVisor Int NOT NULL AUTO_INCREMENT,
 Primary Key (idDoctorVisor)) ENGINE = MyISAM;

Create table EstadoPaciente (
	idEstadoPaciente Int NOT NULL AUTO_INCREMENT,
	descripcion Varchar(20) NOT NULL,
 Primary Key (idEstadoPaciente)) ENGINE = MyISAM;

Create table Archivo (
	idArchivo Int NOT NULL AUTO_INCREMENT,
	idActualizacion Int NOT NULL,
	direccionArchivo Varchar(300) NOT NULL,
 Primary Key (idArchivo)) ENGINE = MyISAM;

Create table PacienteActualizacion (
	idPaciente Int NOT NULL,
	idActualizacion Int NOT NULL,
	isViewed Bool NOT NULL DEFAULT false,
	idPacienteActualizacion Int NOT NULL AUTO_INCREMENT,
 Primary Key (idPacienteActualizacion)) ENGINE = MyISAM;

Create table DoctorActualizacion (
	idDoctor Int NOT NULL,
	idActualizacion Int NOT NULL,
	isViewed Bool NOT NULL,
	idDoctorActualizacion Int NOT NULL AUTO_INCREMENT,
 Primary Key (idDoctorActualizacion)) ENGINE = MyISAM;


Alter table DoctorHasPacientes add Foreign Key (idPaciente) references Paciente (idPaciente) on delete  restrict on update  restrict;
Alter table Caso add Foreign Key (idPaciente) references Paciente (idPaciente) on delete  restrict on update  restrict;
Alter table Alertas add Foreign Key (idPaciente) references Paciente (idPaciente) on delete  restrict on update  restrict;
Alter table PacienteActualizacion add Foreign Key (idPaciente) references Paciente (idPaciente) on delete  restrict on update  restrict;
Alter table DoctorHasPacientes add Foreign Key (idDoctor) references Doctor (idDoctor) on delete  restrict on update  restrict;
Alter table Alertas add Foreign Key (idDoctor) references Doctor (idDoctor) on delete  restrict on update  restrict;
Alter table DoctorColaborador add Foreign Key (idDoctor) references Doctor (idDoctor) on delete  restrict on update  restrict;
Alter table DoctorVisor add Foreign Key (idDoctor) references Doctor (idDoctor) on delete  restrict on update  restrict;
Alter table Caso add Foreign Key (idDoctor) references Doctor (idDoctor) on delete  restrict on update  restrict;
Alter table DoctorActualizacion add Foreign Key (idDoctor) references Doctor (idDoctor) on delete  restrict on update  restrict;
Alter table Actualizacion add Foreign Key (idActualizacionFK) references Actualizacion (idActualizacion) on delete  restrict on update  restrict;
Alter table Archivo add Foreign Key (idActualizacion) references Actualizacion (idActualizacion) on delete  restrict on update  restrict;
Alter table PacienteActualizacion add Foreign Key (idActualizacion) references Actualizacion (idActualizacion) on delete  restrict on update  restrict;
Alter table DoctorActualizacion add Foreign Key (idActualizacion) references Actualizacion (idActualizacion) on delete  restrict on update  restrict;
Alter table Actualizacion add Foreign Key (idCaso) references Caso (idCaso) on delete  restrict on update  restrict;
Alter table DoctorColaborador add Foreign Key (idCaso) references Caso (idCaso) on delete  restrict on update  restrict;
Alter table DoctorVisor add Foreign Key (idCaso) references Caso (idCaso) on delete  restrict on update  restrict;
Alter table DoctorHasPacientes add Foreign Key (idEstado) references Estado (idEstado) on delete  restrict on update  restrict;
Alter table DoctorVisor add Foreign Key (idEstado) references Estado (idEstado) on delete  restrict on update  restrict;
Alter table DoctorColaborador add Foreign Key (idEstado) references Estado (idEstado) on delete  restrict on update  restrict;
Alter table Alertas add Foreign Key (idEstadoPaciente) references EstadoPaciente (idEstadoPaciente) on delete  restrict on update  restrict;


/* Users permissions */


