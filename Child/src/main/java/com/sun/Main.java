package com.sun;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ServiceImple;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");
		ServiceImple i = (ServiceImple) context.getBean(ServiceImple.class);
		i.kk();
	}
}
