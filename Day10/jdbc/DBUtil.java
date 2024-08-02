package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static  Connection con =null;
	public static Connection  getMySQLConnection() {
		
     try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 String url="jdbc:mysql://localhost:3306/NRI";
    	 String uname="root";
    	 String pwd="root";
    	 
    	 con = DriverManager.getConnection(url, uname, pwd);
        
    	 return con;
    	 
     }catch(ClassNotFoundException se) {
    	 se.printStackTrace();
     } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
		
	}
	
	public static void closingMYSQLConnection() {
		  if(con!=null) {
			  try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	}

}
