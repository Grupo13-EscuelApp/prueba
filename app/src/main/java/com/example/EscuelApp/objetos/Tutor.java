package com.example.EscuelApp.objetos;

import java.sql.Date;

public class Tutor {
	
	private int id;
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private String dni;
	private int telefono;
	private String email;
	
	public Tutor (String nombre, String apellidos, Date fechaNacimiento, String dni, int telefono, String email) {
		
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
		this.dni=dni;
		this.telefono= telefono;
		this.email=email;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
