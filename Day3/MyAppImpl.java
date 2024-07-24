package com.training;

public class MyAppImpl implements MyApp{
	@Override
	public void addition(int a, int b) {
		System.out.println("sum of two numbers is : "+(a+b));	
	}
	@Override
	public String sayHello(String m) {
		return "welcome to interface "+m;
	}
	
	public static void main(String[] args) {
     //Interface reference variable holding its implementation class Object
	    MyApp mobj= new MyAppImpl();		
	    mobj.addition(30,30);
	    String ms=mobj.sayHello("raju");
	    
	 //2nd way
	    MyAppImpl mobj1 = new MyAppImpl();
	    mobj1.addition(30,50);
	    System.out.println(mobj1.sayHello("ramu"));
	    
		//Recommended
	    System.out.println("Variables are : using Interface Name");
	    System.out.println(MyApp.collegCode);
	    System.out.println(MyApp.collegeName);
	    
	    System.out.println("Variables are : using Interface refereneVariable");
	    System.out.println(mobj.collegCode);
	    System.out.println(mobj.collegeName);
	    
	}
	
}
