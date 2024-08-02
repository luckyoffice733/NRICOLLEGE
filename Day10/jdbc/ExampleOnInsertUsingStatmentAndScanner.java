package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExampleOnInsertUsingStatmentAndScanner {
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
	//Define the connection url,username and password
	String url="jdbc:mysql://localhost:3306/nri";
	String uname="root";
	String pwd="root";
	
	//Establish the connection between java program and database
	Connection con =DriverManager.getConnection(url,uname,pwd);
	//execute the queries
	Statement stmt =con.createStatement();
	//non-select query
	String query="insert into employee values("+eid+",'"+ename+"',"+esal+")";
	//executing the query
	int i =stmt.executeUpdate(query);
	
	if(i>0) {
		System.out.println("Record inserted");    
	}else {
		System.out.println("Record not inserted");
	}	
	stmt.close();
	con.close();
}
}
