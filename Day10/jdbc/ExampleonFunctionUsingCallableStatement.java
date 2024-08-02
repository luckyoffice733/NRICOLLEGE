package com.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ExampleonFunctionUsingCallableStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//configure url,username and password
		String url="jdbc:mysql://localhost:3306/NRI";
		String uname="root";
		String pwd="root";
		
		Connection con = DriverManager.getConnection(url, uname, pwd);
		//to call the function we to create the object for CallableStatement

		//creating callable statement object to call function
		
		String query="{ ?=call fun_addition(?,?,?)}";
		
		CallableStatement cstmt=con.prepareCall(query);
		
		//register the return value at position 1
		cstmt.registerOutParameter(1,Types.VARCHAR);
		cstmt.setInt(2,10);
		cstmt.setInt(3,50);
		cstmt.setInt(4,40);
		
		cstmt.execute();
		
		
		int sumOfThreeValues = cstmt.getInt(1);
		System.out.println("Sum of three values is  : "+sumOfThreeValues);
		
	
		cstmt.close();
		con.close();
		
		
		
		
}}
