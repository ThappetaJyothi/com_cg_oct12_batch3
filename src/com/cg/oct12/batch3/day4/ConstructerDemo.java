package com.cg.oct12.batch3.day4;

/*
 * constructor - 
 * name is same as class name 
 * it is a special type of method 
 * it does not have a return type 
 * it is used to create and initialize an object of the class 
 * by default JVM provides a zero-args constructor 
 * we also can define constructors 
 * but if we define a constructor, JVM will not provide any constructor
 * a class can have one or more constructors  
 * 
 */
class Employee {

	int eid;
	String name;
	double salary;

	public Employee() {
		System.out.println("zero-args constructor");

	}
	

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		System.out.println("parameterized constructor");
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	

}

public class ConstructerDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.eid = 101;
		emp.name = "Jeevan";
		emp.salary = 10.5;
		//System.out.println(emp.eid + " " + emp.name + " " + emp.salary);
		System.out.println(emp.toString());

		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.name = "Ajeet";
		emp2.salary = 10.6;
		//System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);
		System.out.println(emp.toString());
	}
}
