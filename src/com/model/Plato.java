package com.model;

import java.util.Objects;

import javax.crypto.interfaces.DHPrivateKey;

import exceptions.PrecioPlatoExcepcion;

public class Plato {
	private static final double IVA = 1.21;
	private String nombre;
	private double precio;
	private Vino vino;
	
	public Plato(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Plato(String nombre, double precio) throws PrecioPlatoExcepcion {
		super();
		if (precio <= 0) {
			throw new PrecioPlatoExcepcion();
		}
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precio;
	}
	
	public double getPrecioVentaPublico() {
		return precio * IVA;
	}

	public String getVinoRecomendado() {
		return vino.getNombreVino();
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void incrementaPrecio(double incremento) {
		
	}
	
	public void setVinoRecomendado(Vino vino) {
		 //Vino Recomendado;
	}
	
	public void setVinoRecomendado(String vino, double graduacion) {
		 //Vino Recomendado;
	}
	
	public double getGradosVinoRecomendado() {
		return vino.getGraduacion();
	}
	
	public double getIva() {
		return IVA;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		return this == obj || obj!=null && obj instanceof Plato && this.hashCode()==obj.hashCode();
	}
	@Override
	public String toString() {
		 String vinoInfo = (vino != null) ? " , además el nombre del vino recomendado es: " + vino.getNombreVino() + " , y su graduación es: " + vino.getGraduacion() : " (Sin recomendaciones para el vino.)";
		 return "El nombre del plato es: " + this.nombre +  " , el precio sin IVA es: " + this.precio +  " , el precio venta público es: " + getPrecioVentaPublico() + vinoInfo;	
	}
	
}
