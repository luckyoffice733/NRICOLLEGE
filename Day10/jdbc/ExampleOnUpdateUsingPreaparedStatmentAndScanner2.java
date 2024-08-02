package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExampleOnUpdateUsingPreaparedStatmentAndScanner2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the employee id To delete");
		int eid = sc.nextInt();
		
		//load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/NRI";
		String uname="root";
		String pwd="root";
		
		Connection con = DriverManager.getConnection(url,uname,pwd);
		
		//query
		String query="delete from employee where empid=?";
		//creating preparedStatment Object
		PreparedStatement pstmt =con.prepareStatement(query);
		
		pstmt.setInt(1,eid);
		//execute the query
		int i = pstmt.executeUpdate();
		
		if(i>0) {
			System.out.println("Record is Deleted");
		}else {
			System.out.println("Record not Deleted");
		}
		
	  pstmt.close();
	  con.close();
		
		
		
		
		
		
		
		
	

	}
}
