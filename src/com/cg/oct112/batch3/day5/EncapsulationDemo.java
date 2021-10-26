package com.cg.oct112.batch3.day5;

public class EncapsulationDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
//		emp.salary = 10000;
		System.out.println(emp.getSalary());
		emp.setSalary(10000);
		System.out.println(emp.getSalary());

	}

}