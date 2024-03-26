package com.sathya.springex;

public class Pharmacy {
	
	private String name;
	private String location;
	
	//generating constructor
	
	public Pharmacy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	//pharmacy info method to get pharmacy details
	
	public void pharmacyDetails()
	{
		System.out.println("Pharmacy name:"+name);
		System.out.println("Pharmany location:"+location);
	}
}
