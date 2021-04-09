package com.amazone.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {

	static Connection connection;

	public static Connection openConnection() {
		try {
			String sql = "create table user(userId integer primary key, name varchar(20), password varchar(20), mailId varchar(20), mobileNo integer, address varchar(50))";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "admin123";
			connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.execute();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection() {
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		System.out.println("closeConnection");
	}

}
