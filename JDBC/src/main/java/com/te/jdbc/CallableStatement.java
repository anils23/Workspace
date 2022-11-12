package com.te.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class CallableStatement {
	
	static FileReader reader;
	static Connection connection;
	
	public static void main(String[] args) {
		
		try {
			reader = new FileReader("D:\\Practicing Spring\\jdbc\\source\\properties.properties");
			Properties properties = new Properties();
			properties.load(reader);
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties.getProperty("user"),
					properties.getProperty("password"));
			java.sql.CallableStatement prepareCall = connection.prepareCall(properties.getProperty("query4"));
			prepareCall.setInt(1, 18);
			
			ResultSet executeQuery = prepareCall.executeQuery();
			while (executeQuery.next()) {
				System.out.print(executeQuery.getInt(1) + " ");
				System.out.print(executeQuery.getString(2) + " ");
				System.out.print(executeQuery.getInt(3) + " ");
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
