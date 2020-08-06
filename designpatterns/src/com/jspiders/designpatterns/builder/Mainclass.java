package com.jspiders.designpatterns.builder;

public class Mainclass {

	public static void main(String[] args) {
		
		PersonBuilder personBuilder = new PersonBuilder();
		Person person = personBuilder
		.lives()
		.inState("Karnataka")
		.inCity("Bangalore")
		.atPincode(5600004)
		.works()
		.isCompany("MicroSoft")
		.atPosition("Developer")
		.havingSal(3033.33)
		.build();
		
		System.out.println(person);
		
	}

}
