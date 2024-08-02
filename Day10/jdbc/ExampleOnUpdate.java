package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOnUpdate {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load or register the driver
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 //configure url,username and password
	 String url="jdbc:mysql://localhost:3306/nri";
	 String uname="root";
	 String pwd="root";
	 
	 //establish the connection
	 Connection con = DriverManager.getConnection(url,uname,pwd);	 
	 //create the statement object and execute the queries
	 Statement stmt =con.createStatement();
	 //update query
	 String query="update employee set ename='ravi',sal=5000 where empid=321";
	 
	 //non-execute query;
	 int i =stmt.executeUpdate(query);
	 
	 if(i>0) {
		 System.out.println("record is updated");
	 }else {
		 System.out.println("record is not updated");
	 }
	 
	 stmt.close();
	 con.close();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
		
		
	}

}
