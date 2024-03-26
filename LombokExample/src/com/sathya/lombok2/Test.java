package com.sathya.lombok2;

public class Test {
	
	public static void main(String[] args) {

	//constructor injection
	Employee employee = new Employee(101,"Ratan",43000);
	System.out.println(employee);
	
	//Setter injection
	Employee emp = new Employee();
	emp.setEmpId(102);
	emp.setEmpName("Anu");
	emp.setEmpSalary(35000);
	System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpSalary());
	}
}
