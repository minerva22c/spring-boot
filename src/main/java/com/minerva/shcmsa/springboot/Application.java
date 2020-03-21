package com.minerva.shcmsa.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		System.out.println("Hello World!!");
//		new SpringApplicationBuilder().sources(SpringApplication.class).run(args);
	}

}
