package com.tpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import com.tpe.controller.StudentBean01;

@SpringBootApplication
public class SpringBootPrcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrcApplication.class, args);
	}

	
}
