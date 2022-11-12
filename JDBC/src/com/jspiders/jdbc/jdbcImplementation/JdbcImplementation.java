package com.jspiders.jdbc.jdbcImplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcImplementation {
	


	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		     Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/WEJM3?user=root&password=root");
	         String query="Select * from STUDENTS";	
	         Statement statement = connection.createStatement();
	         ResultSet resultSet = statement.executeQuery(query);
	         while(resultSet.next()) {
	                 System.out.println(resultSet.getString(1)+ "|" + resultSet.getString(2)+ "|" + resultSet.getString(3)+ "|" + resultSet.getString(4)+ "|" + resultSet.getString(5));}
	         }catch (ClassNotFoundException e) {
		 e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
		
		}
		
		}
}
