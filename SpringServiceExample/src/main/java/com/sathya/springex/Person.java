package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	private HomeLoanService homeLoanService;
	
	@Autowired
	private RealEstateService realEstateService;
	
	public void getDetails()
	{
		homeLoanService.loanInfo();
		realEstateService.realEstateService();
	}
	
	

}
