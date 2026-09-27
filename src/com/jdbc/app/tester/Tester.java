package com.jdbc.app.tester;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import com.jdbc.app.DeletDB;
import com.jdbc.app.InsertDB;
import com.jdbc.app.SelectDB;
import com.jdbc.app.UpdateDB;

import con.jdbc.utils.JDBCconnection;

public class Tester {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\t 1] List of Student\n \t 2]Insert Student \n \t 3]Update Student\n \t 4]Delet student\n \t 5]Exit");
			System.out.println("-------------------------------------------------------------");
			System.out.println("Enter Choice From Menu:");
			int choice = sc.nextInt();
			
			if(choice==1) {
				SelectDB.getAllStudents();
			}else if(choice==2) {
				InsertDB.addStudent();
			}else if(choice==3) {
				UpdateDB.updateStudent();
			}else if(choice==4) {
				DeletDB.deletStudent();
			}else if(choice==5) {
				JDBCconnection.closeConnection();
				
				break;
			}
			
			
			
			
		}
		
		
		
	}

}
