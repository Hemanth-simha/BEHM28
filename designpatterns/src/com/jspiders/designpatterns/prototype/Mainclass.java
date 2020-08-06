package com.jspiders.designpatterns.prototype;

public class Mainclass {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address= new Address("Mandya","Ashok Nagar",571401);
		Person person= new Person(101,"king", address);
		
		//Person person1 = person;//shallow cloning
		//person1.address.pincode=5600004;
		
		Person person2 = (Person) person.clone();// deept cloning
		person2.id = 202;
		person2.address.pincode=5600004;
		
		System.out.println("Person : "+person);
		System.out.println("Person 2 : "+person2);
	}

}
