package com.example.EscuelApp.objetos;

import com.example.EscuelApp.miniObjetos.TipoMedia;

import java.sql.Date;



public class Media {
	
	private Usuario uploader;
	private TipoMedia tipo;
	private String archivo;
	private Date timestamp;

	
	public Media(Usuario uploader, TipoMedia tipo, String archivo, Date timestamp) {
		this.uploader=uploader;
		this.tipo=tipo;
		this.archivo=archivo;
		this.timestamp=timestamp;
	}


	public Usuario getUploader() {
		return uploader;
	}


	public void setUploader(Usuario uploader) {
		this.uploader = uploader;
	}


	public TipoMedia getTipo() {
		return tipo;
	}


	public void setTipo(TipoMedia tipo) {
		this.tipo = tipo;
	}


	public String getArchivo() {
		return archivo;
	}


	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}


	public Date getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
