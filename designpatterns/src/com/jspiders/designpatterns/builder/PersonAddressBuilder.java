package com.jspiders.designpatterns.builder;

public class PersonAddressBuilder extends PersonBuilder{
	
	public PersonAddressBuilder(Person person)
	{
		this.person=person;
	}
	public PersonAddressBuilder inState(String state)
	{
		person.state=state;
		return this;
	}
	public PersonAddressBuilder inCity(String city)
	{
		person.city=city;
		return this;
	}
	public PersonAddressBuilder atPincode(int pincode)
	{
		person.pincode=pincode;
		return this;
	}
}
