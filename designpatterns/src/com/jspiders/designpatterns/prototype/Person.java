package com.jspiders.designpatterns.prototype;

public class Person implements Cloneable {
	
	int id;
	String name;
	Address address;
	public Person(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person person = new Person(id, name,(Address) address.clone());
		return person;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
