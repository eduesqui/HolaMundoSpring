package com.eduesqui.services.impl;

import org.springframework.stereotype.Service;

import com.eduesqui.services.IEjemploServicio;
@Service
public class EjemploServicio implements IEjemploServicio{

	@Override
	public String saluda(String nombre) {
		return "Hello, " + nombre + "This is a standard service";
	}

}
