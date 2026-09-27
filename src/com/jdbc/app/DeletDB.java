package com.jdbc.app;

import java.io.IOException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import con.jdbc.utils.JDBCconnection;

public class DeletDB {
	public static void deletStudent() throws ClassNotFoundException, SQLException,IOException {
		Scanner sc = new Scanner(System.in);
		Connection connection = JDBCconnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("delete from studentd where id=?");
		System.out.println("Enter Student id to delete Student: ");
		preparedStatement.setInt(1, sc.nextInt());
				
		int row = preparedStatement.executeUpdate() ;
		if(row > 0) {
		System.out.println("data deleted!!!");
		} else {
		System.out.println("Somting went wrong data is not deleted!!!");
		}
				
		preparedStatement.close() ;
		
	}

}
