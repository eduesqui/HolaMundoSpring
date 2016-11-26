package com.eduesqui.start;

import java.io.IOException;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.eduesqui.services.IEjemploServicio;

/**
 * Clase Inicio de la aplicacion
 * @author Eduardo Gonzalez
 *
 */
@Component
public class Inicio  {
	
	
	final static Logger log = Logger.getLogger(Inicio.class);
	
	/**
	 * Método principal de la aplicación
	 * @param args
	 */
	public static void main(String[] args){
		//ConfiguracionSpring configuracionSpring = new ConfiguracionSpring();
		log.debug("Inicio");
		ClassPathXmlApplicationContext context;
		context = SpringContext.context;
		IEjemploServicio servicio =(IEjemploServicio) context.getBean("ejemploServicio");
		log.debug("Instanciando servicio estandar (bean:ejemploServicio) ");
		log.debug(servicio.saluda("eduesqui"));
		servicio =(IEjemploServicio) context.getBean("ejemploServicioPremium");
		log.debug("Instanciando servicio premium (bean:ejemploServicioPremium) ");
		log.debug(servicio.saluda("eduesqui"));
		
	}
	
	
	

	
	
	
}
