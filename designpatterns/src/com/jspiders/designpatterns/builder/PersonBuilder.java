package com.jspiders.designpatterns.builder;

public class PersonBuilder {
	
	protected Person person = new Person();
	
	public PersonAddressBuilder lives()
	{
		PersonAddressBuilder addressBuilder= new PersonAddressBuilder(person);
		return addressBuilder;
	}
	public PersonJobBuilder works()
	{
		PersonJobBuilder jobBuilder = new PersonJobBuilder(person);
		return jobBuilder;
	}
	
	public Person build()
	{
	  return person;
	}
}
