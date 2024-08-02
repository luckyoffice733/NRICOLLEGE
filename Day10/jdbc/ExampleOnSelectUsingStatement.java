package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOnSelectUsingStatement {
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
	 //select query
	 String query="select * from employee";
	 
	 //to execute the select query we need to call ResultSet executeQuery()
	  ResultSet rs =stmt.executeQuery(query);
	  while(rs.next()) {
		//  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		  //System.out.println(rs.getInt("empid")+" "+rs.getString("ename")+" "+rs.getDouble("sal"));  
		  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
	  
	  }
	 
	  rs.close();
	  stmt.close();
	  con.close();
	 
	 
	 
	 
}
}
