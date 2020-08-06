package com.jspiders.solidprinciples.srp;

public class Student {

	int regno;
	String name;
	String branch;
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", branch=" + branch + "]";
	}
}
