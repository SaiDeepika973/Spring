package com.sathya.springex;

public class Doctor {
	
	private int id;
	private String name;
	
	//generating constructor
	
	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		//doctor info method to get the doctor details
		
	}
		public void doctorInfo()
		{
			System.out.println("Doctor id:"+id);
			System.out.println("Doctor name:"+name);
		}
	}
