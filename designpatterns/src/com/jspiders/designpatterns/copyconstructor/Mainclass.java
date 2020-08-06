package com.jspiders.designpatterns.copyconstructor;

public class Mainclass {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address= new Address("Mandya","Ashok Nagar",571401);
		Person person= new Person(101,"king", address);
		
		Person person1 = new Person(person);
		person1.id=202;
		person1.address.pincode=5600004;
		
		System.out.println(person);
		System.out.println(person1);
		
		}

}
