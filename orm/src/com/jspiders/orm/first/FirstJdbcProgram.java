package com.jspiders.orm.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FirstJdbcProgram {

	public static void main(String[] args) {
		
		Connection CON = null;
		Statement STMT = null;
		try {
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);
			
	String dburl = "jdbc:mysql://localhost:3306/behm28?user=root&password=root";
		 CON = DriverManager.getConnection(dburl);
		
		String query = " insert into person "
				+ " values(101,'king',7676866303)";
		 
		STMT = CON.createStatement();
		int res = STMT.executeUpdate(query);
		
		if(res!=0)
		{
			System.out.println("Person Record inserted....");
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(CON!=null)
				{
					CON.close();
				}
				if(STMT!=null) {
					STMT.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			
		}
		
		
	}

}
