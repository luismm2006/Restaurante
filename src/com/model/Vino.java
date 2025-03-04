package com.model;

import java.util.Objects;

import exceptions.GraduacionVino;

public class Vino {
	private String nombre;
	private double graduacion;
	public Vino(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Vino(String nombre, double graduacion) throws GraduacionVino {
		super();
		if (graduacion <= 0) {
			throw new GraduacionVino();
		}
		this.nombre = nombre;
		this.graduacion = graduacion;
	}
	public String getNombreVino() {
		return this.nombre;
	}
	public double getGraduacion() {
		return this.graduacion;
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
		return "El vino se llama: " + this.nombre + " y su graduación es: " + this.graduacion;
	}
}
