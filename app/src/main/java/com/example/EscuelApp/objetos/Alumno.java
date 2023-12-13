package com.example.EscuelApp.objetos;

import java.sql.Date;

public class Alumno {

	private int id;
	private String nombre;
	private String apellidos;
	private Date fechaNacimietno;
	private String nivel;
	private String clase;
	private Tutor tutor;
	private Usuario usuario;
	
	public Alumno(String nombre, String apellidos, Date fechaNacimiento, String nivel, String clase, Tutor tutor, Usuario usuario) {
		
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimietno=fechaNacimiento;
		this.nivel=nivel;
		this.clase=clase;
		this.tutor=tutor;
		this.usuario=usuario;
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

	public Date getFechaNacimietno() {
		return fechaNacimietno;
	}

	public void setFechaNacimietno(Date fechaNacimietno) {
		this.fechaNacimietno = fechaNacimietno;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
