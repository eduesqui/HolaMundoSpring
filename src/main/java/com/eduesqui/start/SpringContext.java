package com.eduesqui.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Clase que inicializa 
 * @author Eduardo Gonzalez
 *
 */
public class SpringContext {
	
	public static ClassPathXmlApplicationContext context;
	
	static{
		context =  new ClassPathXmlApplicationContext("classpath:appContext.xml");
	}

	/*
	public ClassPathXmlApplicationContext getContext(){
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("classpath:appContext.xml");
		return context;
	}
	*/
}
