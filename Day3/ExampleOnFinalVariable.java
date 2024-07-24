package com.training;

public class ExampleOnFinalVariable {
	final int departCode=10; //declare and initialize
	final float pi; //declare and initialize in the instance block
	//instance block  we be called before object creation
	{     
		System.out.println("we are in instance object");
		pi=3.142f; //initialized the final variable in instance block
	}
	public void m1(){
	  // pi=12121f;//we cannot reassign the final variable value
		System.out.println("final variable value is : "+pi);
	}
	public static void main(String[] args) {
		ExampleOnFinalVariable eof = new ExampleOnFinalVariable();
		eof.m1();
	}
	
}
