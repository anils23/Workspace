package com.te.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Properties;

public class UpdateTable {

	static FileReader reader;
	static Connection connection;

	public static void main(String[] args) {

		try {
			reader = new FileReader("D:\\Practicing Spring\\jdbc\\source\\properties.properties");
			Properties properties = new Properties();
			properties.load(reader);
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties.getProperty("user"),
					properties.getProperty("password"));
			Statement createStatement = connection.createStatement();
			try {
				int i = createStatement.executeUpdate(properties.getProperty("query2"));
				System.out.println(i + " " + "Row Inserted");
			} catch (Exception e) {
				System.out.println("Row Already Inserted");
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
