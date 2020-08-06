package com.jspiders.designpatterns.singleton;

public class Mainclass {

	public static void main(String[] args) {
		
		Connection con1 = Connection.getInstance();
		Connection con2 = Connection.getInstance();
		Connection con3 = Connection.getInstance();
	   
		System.out.println("Connection : 1 "+con1.hashCode());
		System.out.println("Connection : 2 "+con2.hashCode());
		System.out.println("Connection : 3 "+con3.hashCode());
	}

}
