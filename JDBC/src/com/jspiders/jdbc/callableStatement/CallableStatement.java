package com.jspiders.jdbc.callableStatement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CallableStatement {
	
	private static Connection connection;
	private static Statement statement;
	private static FileReader fileReader;
	private static Properties properties;
	
	public static void main(String[] args) throws IOException, SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		fileReader = new FileReader("D:\\WEJM3\\JDBC\\sources\\properties.properties");
		properties = new Properties();
		properties.load(fileReader);
		connection = DriverManager.getConnection(properties.getProperty("dburl"), properties.getProperty("user"), properties.getProperty("password"));
		
	    
	}

}
