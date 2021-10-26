package com.cg.oct112.batch3.day5;

//Encapsulation - 
//bind data members with methods 
//to secure data 
//make fields as private 
//make public methods to access those fields 

//generate fields,default constuctor,all-parametarised constructor,getters,setters,and to-string;
public class Employee {

	private int eid;
	private String firstName;
	private double salary = 8000; // read-only field
     
	public Employee() {
		super();
	}
	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + "]";
	}
	

}