package com;

import com.model.Plato;

import exceptions.PrecioPlatoExcepcion;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		try {
			Plato plato1 = new Plato("Macarrones", 4);
			System.out.println(plato1.toString());
		} catch (PrecioPlatoExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
