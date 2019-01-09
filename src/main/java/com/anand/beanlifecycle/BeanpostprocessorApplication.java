package com.anand.beanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanpostprocessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanpostprocessorApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(AppConfig.class);
	    ctx.refresh();
	    ElephantService service = ctx.getBean(ElephantService.class);
		service.print();
    	ctx.registerShutdownHook();

	}

}

