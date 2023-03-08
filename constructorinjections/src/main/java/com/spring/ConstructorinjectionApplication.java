package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ci.Trainer;

@SpringBootApplication
public class ConstructorinjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstructorinjectionApplication.class, args);

    	ApplicationContext context=new ClassPathXmlApplicationContext("ciconfig.xml");
		Trainer trainer=(Trainer)context.getBean("trainer");
		System.out.println(trainer);

		}

}
