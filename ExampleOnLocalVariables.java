package com.training;
public class ExampleOnLocalVariables {
	int empId=1001;
	int a=10; //instance variable

	public void m1() {
		int a=30; //local variables
		String empName="smith"; //local variable
		double empSal=4000 ;//local variable
		System.out.println(this.empId);
		System.out.println("empName is : "+empName);
		//Note:- local variable must be initialized before use it.
		
		System.out.println("empSal is : "+empSal);
		System.out.println("the variable value of a : "+a);//local variable
		System.out.println("the variable value of a : "+this.a);//instance
	}
	public static void main(String[] args) {
		ExampleOnLocalVariables eov = new ExampleOnLocalVariables();
		eov.m1();
		
	}
}
