package com.training.exception;

public class ExampleOnExceptionHandling2 {
	
	public static void main(String[] args) {
		String s=null;
		
		System.out.println("statement-1");
		try {
		System.out.println(s.length());
		}catch (NullPointerException e) {
		    System.err.println("  do operation you will the error");
		}
		System.out.println("end of the program");
			
	}

}
