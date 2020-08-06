package com.jspiders.designpatterns.singleton;

public class Connection {
	
	private static Connection con = null;
	private Connection()
	{
		System.out.println("Object Created");
	}
	public static Connection getInstance()
	{
		if(con==null)
		{
			con = new Connection();
			return con;
		}
		return con;
	}
}
