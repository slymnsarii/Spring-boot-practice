package com.tpe.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.multipart.PartHttpMessageWriter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentBean01Controller {
	
	@GetMapping(path="/getRequest")
	public String getMethod1() {
		return "getRequest ile getMethod1 calistirildi";
	}
	
	//tight coupling
	@GetMapping(path="/getObjectTight")
	public StudentBean01 getMethod2() {
		return new StudentBean01("Ahat Dertsiz ",35,"AD202215");
		}
		
	//louse coupling
	@Autowired
	StudentBean01 studentBean01;
	@GetMapping(path="/getObjectLoose")
	public StudentBean01 getMethod3() {
		studentBean01.setName("Erdal Bey");
		studentBean01.setAge(35);
		studentBean01.setId("EB2022Dev");
		return studentBean01;
	}
}
