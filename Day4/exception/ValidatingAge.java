package com.training.exception;

import java.util.Scanner;
public class ValidatingAge {
	
	public static void main(String[] args) {
		Scanner scobj = new Scanner(System.in);
		
		
		System.out.println("Enter the age");
		int age = scobj.nextInt();
		try {
		if(age<18) {
			throw new InvalidAgeException("Age should be "
					+ "greater than or equal to 18 to cast vote");
		}else {
			System.out.println("Age is valid to caste the vote");
		}
		}catch(InvalidAgeException iae) {
			System.err.println(iae.getMessage());
		}	
	}   
}
