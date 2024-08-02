package com.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExampleOnProcedureUsingCallableStatement {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//load or register the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//configure url,username and password
	String url="jdbc:mysql://localhost:3306/NRI";
	String uname="root";
	String pwd="root";
	
	Connection con = DriverManager.getConnection(url, uname, pwd);
	//to call the procedure we to create the object for CallableStatement
	//creating Object for callable statement to call a procedure
	
	String query="{call getEmpDetails(?)}";
	
	CallableStatement cstmt =con.prepareCall(query);
	cstmt.setInt(1,101);
	//execute the procedure 
	ResultSet res =cstmt.executeQuery(); // or cstmt.execute();
	System.out.println("Calling a procedure");
	while(res.next()) {
		System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getDouble(3));
	}
	
	res.close();
	cstmt.close();
	con.close();
	
}
}
