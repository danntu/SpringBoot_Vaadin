package com.danntu.SpringBoot.Vaadin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.danntu.SpringBoot")
public class SpringBootVaadinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVaadinApplication.class, args);
	}
}
