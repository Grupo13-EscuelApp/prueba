package com.example.EscuelApp.objetos;

public class Usuario {
	
	private int id;
	private String nombreUsuario;
	private String contraseña;
	
	
	public Usuario(String nombreUsuario, String contraseña) {
		this.nombreUsuario=nombreUsuario;
		this.contraseña=contraseña;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
