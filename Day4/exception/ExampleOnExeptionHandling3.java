package com.training.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleOnExeptionHandling3 {
	
	
	public static void main(String[] args) {
		
	 Scanner scobj = new Scanner(System.in);
	  try {
	 
	  System.out.println("Enter the first int value");
	  int a=scobj.nextInt();
	  
	  System.out.println("Enter the first int value");
	  int b=scobj.nextInt();
	  
	  int c = a/b;
	  
	  System.out.println("Division of two numbers : "+c);
	  
	  }catch(InputMismatchException ae) {
		  System.err.println("Excepting Int value but inserted string value");
	  }catch(Exception ie) {
		  ie.printStackTrace();  
			 }
			 
	  System.out.println("rest of code");
	}
   
}
