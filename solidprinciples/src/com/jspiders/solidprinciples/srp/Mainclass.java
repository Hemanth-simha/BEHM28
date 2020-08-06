package com.jspiders.solidprinciples.srp;

public class Mainclass {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setRegno(101);
		student.setName("King");
		student.setBranch("ECE");
		
		InsertStudentDetails studentDetails = new InsertStudentDetails();
		studentDetails.insert(student);
	}

}
