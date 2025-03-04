package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class JavaConfig {
	
	@Bean
	public Doctor doctor()
	{
		Doctor doctor = new Doctor(101,"Deepika");
		return doctor;
	}
	
	@Bean
	public Pharmacy pharmacy()
	{
		Pharmacy pharmacy = new Pharmacy("MedPlus","Hyderabad");
		return pharmacy;
	}
	
	@Bean
	public Patient patient()
	{
		Patient patient = new Patient("Kranthi",38,doctor(),pharmacy());
		return patient;
	}

}
