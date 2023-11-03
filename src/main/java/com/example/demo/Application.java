package com.example.demo;


//Made in STS as eclipse does not have the features. can make a spring boot project online and import in eclipse
//In intellij its paid
//Basic Spring Boot Concept Project
//DI Autowiring Container
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		//Spring container initialized
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//By default scope is singleton
		//Even if we dont use get bean - object gets created (consturctor) - singleton design pattern
		//no need to wait for the object - it gives you the object
		//But in singleton only one object is created. In protype multiple times.(based on the calls of getbean)
		Laptop l = context.getBean(Laptop.class);
		l.show();
		
		Laptop l1 = context.getBean(Laptop.class);
		l1.show();
	}

}
