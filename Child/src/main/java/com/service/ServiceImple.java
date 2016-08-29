package com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("ServiceImple")
public class ServiceImple {

	@Value("${name}")
	private String name;
	@Value("${age}")
	private String age;

	public void kk() {
		System.out.print(name + ">>>>>" + age);
	}
}
