package com.jspiders.jdbc.jdbcImplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MobileInfo {
	static Connection connection;
	static Statement statement;
	static ResultSet resultSet;
	public static void main(String[] args) {
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/WEJM3","root","root");
			String query = "select * from MOBILEINFO where MOBILE_ID =005";
			String query1 = "select * from MOBILEINFO";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query1);
            while (resultSet.next()) {
            	System.out.println(resultSet.getString(1)+ "|" + resultSet.getString(2) + "|" + resultSet.getString(3) + "|" + resultSet.getString(4) + "|");
            }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				   e.printStackTrace();
				}
				if (statement != null) {
                   try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
                   if (resultSet != null) {
                	   try {
						resultSet.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}		
				}
				}
			}
			
		}
	}
}
