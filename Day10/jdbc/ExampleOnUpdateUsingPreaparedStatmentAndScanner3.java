package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExampleOnUpdateUsingPreaparedStatmentAndScanner3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the employee id");
		int eid = sc.nextInt();
		System.out.println("Enter the employee Name");
		String ename=sc.next()+sc.nextLine();
		System.out.println("Enter the employee sal");
		double esal=sc.nextDouble();
		//load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/NRI";
		String uname="root";
		String pwd="root";
		
		Connection con = DriverManager.getConnection(url,uname,pwd);
		
		//query
		String query="update employee set ename=?,sal=? where empid=?";
		//creating preparedStatment Object
		PreparedStatement pstmt =con.prepareStatement(query);
		
		pstmt.setString(1,ename);
		pstmt.setDouble(2,esal);
		pstmt.setInt(3,eid);
		
		//execute the query
		int i = pstmt.executeUpdate();
		
		if(i>0) {
			System.out.println("Record is Updated");
		}else {
			System.out.println("Record not Updated");
		}
		
	  pstmt.close();
	  con.close();
		
		
		
		
		
		
		
		
	

	}
}
