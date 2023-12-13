package com.example.EscuelApp.objetos;

import com.example.EscuelApp.miniObjetos.Cantidad;

import java.sql.Date;



public class Ingesta {
	
	private Usuario alimentadoPor;
	private String tipoComida;
	private Cantidad cantidad;
	private Date tiemstamp;
	
	public Ingesta (Usuario alimetadoPor, String tipoComida, Cantidad cantidad, Date timestamp) {
		
		this.alimentadoPor=alimetadoPor;
		this.tipoComida=tipoComida;
		this.cantidad=cantidad;
		this.tiemstamp=timestamp;
		
	}

	public Usuario getAlimentadoPor() {
		return alimentadoPor;
	}

	public void setAlimentadoPor(Usuario alimentadoPor) {
		this.alimentadoPor = alimentadoPor;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public Cantidad getCantidad() {
		return cantidad;
	}

	public void setCantidad(Cantidad cantidad) {
		this.cantidad = cantidad;
	}

	public Date getTiemstamp() {
		return tiemstamp;
	}

	public void setTiemstamp(Date tiemstamp) {
		this.tiemstamp = tiemstamp;
	}

	
}
