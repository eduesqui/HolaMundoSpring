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
		log.debug("Start");
		ClassPathXmlApplicationContext context;
		context = SpringContext.context;
		IEjemploServicio servicio =(IEjemploServicio) context.getBean("ejemploServicio");
		log.debug("Instance of standard service (bean:ejemploServicio) ");
		log.debug(servicio.saluda("This is a standard service"));
		servicio =(IEjemploServicio) context.getBean("ejemploServicioPremium");
		log.debug("Instance of  premium service (bean:ejemploServicioPremium) ");
		log.debug(servicio.saluda("This is a premium service"));
		
	}
	
	
	

	
	
	
}
