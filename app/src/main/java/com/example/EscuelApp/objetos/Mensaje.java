package com.example.EscuelApp.objetos;

import java.sql.Date;

public class Mensaje {
	
	private Usuario remitente;
	private Usuario destinatario;
	private String contenido;
	private Date timestamp;

	
	public Mensaje(Usuario remitente, Usuario destinatario, String Contenido, Date timestamp) {
		
		this.remitente=remitente;
		this.destinatario=destinatario;
		this.contenido=contenido;
		this.timestamp=timestamp;
	}


	public Usuario getRemitente() {
		return remitente;
	}


	public void setRemitente(Usuario remitente) {
		this.remitente = remitente;
	}


	public Usuario getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(Usuario destinatario) {
		this.destinatario = destinatario;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	public Date getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	

}

