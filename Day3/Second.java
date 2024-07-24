package com.training;
//example on methodOverriding
public class Second  extends First{

	public void display() {
	System.out.println("we are in display method of Second");
	}
	//this annotation will check exact method signature from parent class
	@Override  
	public void sayHello(String m) {//Overriding method
		System.out.println("we are in sayhello of Second "+m);
	}
	public static void main(String[] args) {
		
		  Second sobj =new Second(); 
		  sobj.sayHello("raju");
		  sobj.m2();
		  sobj.display();
		
	    //Super class Reference variable holding its sub class object  
		First fobj = new Second();
		fobj.sayHello("ramu");
		fobj.m2();
		
		
		
	}
	
}
