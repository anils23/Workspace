package com.jsipders.jdbc.createTable;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Theatre {
	private static Connection connection;
	private static Statement statement;
	private static FileReader fileReader;
	private static Properties properties;
	private static int resultInt;
	private static int resultInt1;
	private static int resultInt2;
	private static ResultSet resultSet;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader = new FileReader("D:\\WEJM3\\JDBC\\sources\\properties.properties");
			properties = new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties.getProperty("user"),
					properties.getProperty("password"));
			statement = connection.createStatement();
			resultInt = statement.executeUpdate(properties.getProperty("query19"));
			resultInt = statement.executeUpdate(properties.getProperty("query9"));
			System.out.println(resultInt + " Table Created");
			System.out.println();
			resultInt = resultInt + statement.executeUpdate(properties.getProperty("query10"));
			resultInt = resultInt + statement.executeUpdate(properties.getProperty("query11"));
			resultInt = resultInt + statement.executeUpdate(properties.getProperty("query12"));
			resultInt = resultInt + statement.executeUpdate(properties.getProperty("query13"));
			resultInt = resultInt + statement.executeUpdate(properties.getProperty("query14"));
			System.out.println(resultInt + " row(s) Inserted");
			System.out.println();

			resultSet = statement.executeQuery(properties.getProperty("query18"));
			while (resultSet.next()) {
				System.out
						.println(resultSet.getString(1) + "|" + resultSet.getString(2) + "|" + resultSet.getString(3));
			}
			System.out.println();

			resultInt1 = statement.executeUpdate(properties.getProperty("query15"));
			resultInt1 = resultInt1 + statement.executeUpdate(properties.getProperty("query16"));
			System.out.println(resultInt1 + " row(s) Updated");
			System.out.println();

			resultSet = statement.executeQuery(properties.getProperty("query18"));
			while (resultSet.next()) {
				System.out
						.println(resultSet.getString(1) + "|" + resultSet.getString(2) + "|" + resultSet.getString(3));
			}
			System.out.println();

			resultInt2 = statement.executeUpdate(properties.getProperty("query17"));
			System.out.println(resultInt2 + " row(s) Deleted");
			System.out.println();

			resultSet = statement.executeQuery(properties.getProperty("query18"));
			while (resultSet.next()) {
				System.out
						.println(resultSet.getString(1) + "|" + resultSet.getString(2) + "|" + resultSet.getString(3));
			}
			System.out.println();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
