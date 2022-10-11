package com.tpe.controller;

import org.springframework.stereotype.Component;

@Component
public class StudentBean01 implements StudentInterface{

	
	
	
	public StudentBean01() {
		System.err.println("pm'siz const calisti");
	}

	public StudentBean01(String name, int age, String id) {
		
		this.name = name;
		this.age = age;
		this.id = id;
	}

	private String name;
	
	private int age;
	
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String study() {
		
		return "Student01 class'indan geliyorum";
	}
	
	
	
}
