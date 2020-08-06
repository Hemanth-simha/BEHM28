package com.jspiders.designpatterns.builder;

public class Person {
	
	//Address
	String state;
	String city;
	int pincode;
	
	//Job
	String company;
	String position;
	double salary;
	@Override
	public String toString() {
		return "Person [state=" + state + ", city=" + city + ", pincode=" + pincode + ", company=" + company
				+ ", position=" + position + ", salary=" + salary + "]";
	}
	
	
}
