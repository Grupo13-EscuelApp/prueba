package com.example.EscuelApp.objetos;

import com.example.EscuelApp.miniObjetos.TipoDeposicion;

import java.sql.Date;



public class Deposicion {
	
	private TipoDeposicion tipo;
	private Date tiemstamp;
	
	public Deposicion(TipoDeposicion tipo, Date timestamp) {
		
		this.tipo=tipo;
		this.tiemstamp=timestamp;
		
	}

}
