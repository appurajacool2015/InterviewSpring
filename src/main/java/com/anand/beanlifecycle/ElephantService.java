package com.anand.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ElephantService {
	@PostConstruct
	public void init() {
		System.out.println("ElephantService:: inside @PostConstruct method");
	}	
	public void print() {
		System.out.println("ElephantService:: inside elephantservice Hello World!");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("ElephantService:: Inside @PreDestroy method");		
		System.out.println("=======================LIFECYCLE OF BEAN ENDS=========================");		
	}
}