package com.turkcell.cmm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.turkcell.cmm")
public class CmmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmmApplication.class, args);
	}

}
