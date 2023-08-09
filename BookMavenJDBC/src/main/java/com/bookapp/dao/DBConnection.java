package com.bookapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.bookapp.util.Queries;

public class DBConnection {
	static Connection connection;
	public static Connection openConnection() {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password="admin@123";
		
		try {
			connection=DriverManager.getConnection(url, username, password);
//			Statement statement=connection.createStatement();
//			statement.execute(Queries.CREATEQUERY);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
