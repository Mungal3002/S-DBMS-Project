package com.jdbc.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import con.jdbc.utils.JDBCconnection;

public class InsertDB {

	public static void addStudent() throws ClassNotFoundException, SQLException , IOException {
		Scanner sc = new Scanner(System.in);
// you can load any class dynamically into JVM method area using forName
//in java we have class as class with static method forName
Connection connection = JDBCconnection.getConnection();

String query ="insert into student(name,marks,rollno) values (?,?,?)";
PreparedStatement statement = connection.prepareStatement(query);
//System.out.println("Enter Student ID:");
//int idstudent =sc.nextInt();

System.out.println("Enter Student name:");
String name =sc.next();

System.out.println("Enter Student Marks:");
double marks =sc.nextDouble();

System.out.println("Enter Student rollno:");
int rollno =sc.nextInt();

//statement.setInt(1, idstudent);
//
statement.setString(1, name);
statement.setDouble(2, marks);
statement.setInt(3, rollno );



int row = statement.executeUpdate();
if(row > 0) {
	System.out.println("data inserted !!!");
}else {
	System.out.println("something went wrong");
}

statement.close();




	}

}
