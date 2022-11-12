package com.jspiders.jdbc.executeUpdate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcDelete {
	private static Connection connection;
	private static Statement statement;
	private static FileReader fileReader;
	private static Properties properties;
	private static int resultInt;
	
	
	
	
	public static void main(String[] args) {
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader = new FileReader("D:\\WEJM3\\JDBC\\sources\\properties.properties");
			properties = new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties.getProperty("user"), properties.getProperty("password"));
		    statement = connection.createStatement();
		    resultInt = statement.executeUpdate(properties.getProperty("query6"));
		    resultInt = resultInt + statement.executeUpdate(properties.getProperty("query7"));
		    System.out.println(resultInt + " row's Deleted");
		 
		 } catch (ClassNotFoundException e) {
					e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
	     	e.printStackTrace();
		} catch (SQLException e) {
					e.printStackTrace();
		}
		 finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (statement !=null) {
					try {
						statement.close();
					} catch (SQLException e) {
					 e.printStackTrace();
					}
					
				}
				
			}
		}
			
	  }

	 }


