package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalService;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringIn5StepPropertiesApplication {

	public static void main(String[] args) {
//		BinarySearchImp binarySearchImp = new BinarySearchImp(new QuickSortAlgo());
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepPropertiesApplication.class, args);
		
		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		
		System.out.println(service.returnUrl());
	
		
	}

}
