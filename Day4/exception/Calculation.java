package com.training.exception;

public class Calculation {
    public static void main(String[] args) {
		
    System.out.println("statement -1");
    try { 	
    	
    int x =10/0;
    System.out.println("x value is : "+x);
    
    }catch(ArithmeticException e) {
    	//e.printStackTrace();
    	//System.out.println(e.getMessage());
    	System.err.println("Denominator Should not be Zero ");
    }
    System.out.println("statement - 2/end of the line");
    	
	}
}
