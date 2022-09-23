package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class cp {
	
	/*private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/student_manage?characterEncoding=utf8";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "1234";*/
	public static Connection createC()
	{
	Connection conn = null;
	try{
		//Register the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		//Open the connection
		  conn = DriverManager.
		getConnection("jdbc:mysql://localhost:3306/student_manage?characterEncoding=utf8", "root", "1234");
		// return conn;
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return conn;
}
}

