package com.jdbc.app;

import java.io.IOException;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import con.jdbc.utils.JDBCconnection;

public class SelectDB {

	public static void getAllStudents() throws ClassNotFoundException, SQLException, IOException {
		Connection connection = JDBCconnection.getConnection();
		
			
		Statement statement = connection.createStatement();
		System.out.println(4);
		String query ="select * from student";
		ResultSet resultSet = statement.executeQuery(query);
		
		while(resultSet.next()){
			
			int Idstudent= resultSet.getInt("Idstudent");
			String name= resultSet.getString("name");
			double marks= resultSet.getDouble("marks");
			int rollno=resultSet.getInt("rollno");
	        
			System.out.println(Idstudent+">> "+name+">> "+marks+">> " + rollno);
		}
		
		
		
		statement.close();
		
	}

}