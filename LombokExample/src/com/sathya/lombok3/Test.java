package com.sathya.lombok3;


public class Test {
	
	public static void main(String[] args) {
		Employee employee = Employee.builder()
							.empId(101)
							.empName("Ratan")
							.empSalary(45000)
							.build();
		
		System.out.println(employee);
		
	}
}
