package com.eduesqui.services.impl;

import org.springframework.stereotype.Service;

import com.eduesqui.services.IEjemploServicio;
@Service
public class EjemploServicioPremium implements IEjemploServicio{

	@Override
	public String saluda(String nombre) {
		return "Buen dias Sr " + nombre + " En que puedo servirle?";
	}

}
