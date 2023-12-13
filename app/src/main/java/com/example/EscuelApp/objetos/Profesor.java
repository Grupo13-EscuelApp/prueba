package com.example.EscuelApp.objetos;

public class Profesor {

	private int id;
	private String nombre;
	private String apellidos;
	private String especialidad;
	private String clase;
	private String dni;
	private String direccion;
	private int telefono;
	private String email;
	
	public Profesor(String nombre, String apellidos, String especialidad, String clase, String dni, String direccion,
			int telefono, String email) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.especialidad=especialidad;
		this.clase= clase;
		this.dni= dni;
		this.direccion=direccion;
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
