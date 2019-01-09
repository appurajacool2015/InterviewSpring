package com.anand.beanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.anand.beanlifecycle.ElephantService;
import com.anand.beanlifecycle.AppConfig;

@SpringBootApplication
public class InterviewSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewSpringApplication.class, args);
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(AppConfig.class);
	    ctx.refresh();
	    ElephantService service = ctx.getBean(ElephantService.class);
		service.print();
    	ctx.registerShutdownHook();
	}

}

