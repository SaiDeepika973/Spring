package com.sathya.lombok4;

public class Test {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEmpName("Deepika");
		employee.setEmpSalary(10090);
		System.out.println(employee.getEmpId()+" "+employee.getEmpName()+" "+employee.getEmpSalary());

	}

}
