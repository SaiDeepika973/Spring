package com.sathya.springex;

public class Person {
	
	private String name;
	private String email;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Person() {
		System.out.println("Person class :: object created successfully");
	}
	
	public void personInfo() {
		System.out.println("Your Name:"+name);
		System.out.println("Your email id is:"+email+" You will get further updates here");
	}

}