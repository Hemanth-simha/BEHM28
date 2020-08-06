package com.jspiders.designpatterns.prototype;

public class Address implements Cloneable{
	
	String city;
	String street;
	int pincode;
	
	public Address(String city, String street, int pincode) {
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Address address= new Address(city, street, pincode);
		return address;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", pincode=" + pincode + "]";
	}
}
