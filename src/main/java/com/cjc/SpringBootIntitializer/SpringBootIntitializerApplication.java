package com.cjc.SpringBootIntitializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIntitializerApplication {

	public static void main(String[] args) {
		
		System.out.println("Boot Initializer");
		SpringApplication.run(SpringBootIntitializerApplication.class, args);
	}

}
