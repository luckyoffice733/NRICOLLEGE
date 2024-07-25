package com.training.exception;

import java.util.Scanner;

public class ValidatingPersonName {
	
	public static void main(String[] args) {
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter the firstname: ");
		String fname = scobj.nextLine();
		System.out.println("Enter the lastname: ");
		String lname = scobj.nextLine();
		
		
		try {
		//if(fname.isEmpty() || lname.isEmpty()) {
		if(fname.length()==0 || lname.length()==0) {
			throw new NameException("FirstName or LastName Cannot Be Blank");
		}else {
			System.out.println("FullName is : "+fname+" "+lname);
		}
		}catch(NameException ne) {
			System.err.println(ne.getMessage());
		}finally {
			System.out.println("we are in finally block");
			scobj.close();
		}
		
		//System.out.println(fname+" "+lname);
	}

}
