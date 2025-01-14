package com.sathya.springex;

public class Patient {
	
	private String name;
	private int age;
	private Doctor doctor;
	private Pharmacy pharmacy;
	
	//generating constructor
	
	public Patient(String name, int age, Doctor doctor, Pharmacy pharmacy) {
		super();
		this.name = name;
		this.age = age;
		this.doctor = doctor;
		this.pharmacy = pharmacy;
	}
	
	public void getDetails()
	{
		System.out.println("Patient name:"+name);
		System.out.println("Patient age:"+age);
		System.out.println("Doctor:");
		doctor.doctorInfo();
		System.out.println("Pharmacy:");
		pharmacy.pharmacyDetails();
	}
}
