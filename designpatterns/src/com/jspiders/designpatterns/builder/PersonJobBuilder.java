package com.jspiders.designpatterns.builder;

public class PersonJobBuilder extends PersonBuilder{

	public PersonJobBuilder(Person person)
	{
		this.person=person;
	}
	public PersonJobBuilder isCompany(String company)
	{
		person.company=company;
		return this;
	}
	public PersonJobBuilder atPosition(String position)
	{
		person.position=position;
		return this;
	}
	public PersonJobBuilder havingSal(double salary)
	{
		person.salary=salary;
		return this;
	}
}
