package com.jdbc.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import con.jdbc.utils.JDBCconnection;

public class UpdateDB {

	public static void updateStudent() throws ClassNotFoundException, SQLException,IOException {
		Scanner sc =new Scanner(System.in);
		
	Connection connection = JDBCconnection.getConnection();


String query ="update student set name=? where idstudent=? ";
PreparedStatement preparedstatement = connection.prepareStatement(query);
System.out.println("Enter Updated Name:");
preparedstatement.setString(1, sc.next());

System.out.println("Enter Student Id:");
preparedstatement.setInt(2, sc.nextInt());

int row = preparedstatement.executeUpdate();
if(row > 0) {
	System.out.println("data is updated !!!");
}else {
	System.out.println("something went wrong");
}

preparedstatement.close();



	}

}
