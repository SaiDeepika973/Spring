package com.sathya.lombok4;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class Employee {
	
	private int empId;
	@NonNull private String empName;
	private double empSalary;

}
