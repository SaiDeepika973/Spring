package com.sathya.springex;

public class Car implements Vehicle{

	private String fuelType;
	private int maxSpeed;
	
	//generate getters and setters
	
	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public void move() {
		
		System.out.println("You selected Car Vehicle");
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Maximum Speed:"+maxSpeed);
		
	}

	
	
	
	
		
		
		
		
		
	}

