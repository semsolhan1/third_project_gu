package com.java.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private DatabaseConnection() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static DatabaseConnection connection 
	= new DatabaseConnection();
	
	public static DatabaseConnection getInstance() {
		return connection;
	}
	
	//Connection 객체를 리턴하는 메서드
	public Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "hr";
		String upw = "hr";
		
		return DriverManager.getConnection(url,uid,upw);
		
	}
}
