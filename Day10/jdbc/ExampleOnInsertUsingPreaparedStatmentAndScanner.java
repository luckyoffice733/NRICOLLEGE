package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExampleOnInsertUsingPreaparedStatmentAndScanner {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the employee id");
		int eid = sc.nextInt();
		
		System.out.println("Enter the employee Name");
		String ename=sc.next()+sc.nextLine();
		
		System.out.println("Enter the employee sal");
		double esal=sc.nextDouble();
		/*
		 * //load or register the driver Class.forName("com.mysql.cj.jdbc.Driver");
		 * 
		 * String url="jdbc:mysql://localhost:3306/NRI"; String uname="root"; String
		 * pwd="root";
		 * 
		 * Connection con = DriverManager.getConnection(url,uname,pwd);
		 */
		//getting connection Object from DBUTILS class
		//query
		Connection con =DBUtil.getMySQLConnection();
		String query="insert into employee values(?,?,?)";
		//creating preparedStatment Object
		PreparedStatement pstmt =con.prepareStatement(query);
		
		pstmt.setInt(1,eid);
		pstmt.setString(2,ename);
		pstmt.setDouble(3, esal);
		
		//execute the query
		int i = pstmt.executeUpdate();
		
		if(i>0) {
			System.out.println("Record inserted");
		}else {
			System.out.println("Record not inserted");
		}
		
	  pstmt.close();
	  con.close();
		
		
		
		
		
		
		
		
	

	}
}
