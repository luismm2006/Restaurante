package com.model;

import exceptions.AltaPlatoException;

public class Restaurante {
	private Plato[] platos;
	private Vino[] vinos;
	
	
	
	
	public Restaurante(Plato[] platos, Vino[] vinos) {
		super();
		this.platos = platos;
		this.vinos = vinos;
	}

	public void altaPlato(Plato plato, double precio) throws AltaPlatoException {
		boolean agregado = false;
		for (int i = 0; i < platos.length && !agregado; i++) {
			if (platos[i]==null) {
				agregado = true;
				platos[i] = plato;
				plato.setPrecio(precio);
			}
			if (platos[i].equals(platos[i])) {
				throw new AltaPlatoException();
			}
		}
	}

	public Plato[] getPlatos() {
		return platos;
	}

	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}

	public Vino[] getVinos() {
		return vinos;
	}

	public void setVinos(Vino[] vinos) {
		this.vinos = vinos;
	}

	
	

}
