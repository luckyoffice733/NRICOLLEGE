package com.training.java8features;

public class C implements XYZ{

	@Override
	public void m1() {
	System.out.println("we are in C class of MethodOne");	
	}

	@Override
	public String sayHello(String m) {
		return "welcome "+m;
	}

	@Override
	public void m2() {
		System.out.println("we are in C class of MethodTwo");	
	}
    @Override //we are overriding default method in class
	public void display() {
		System.out.println("changing the display method code in C implementation class");
	}
    
	/*
	 * @Override public void methodThree() {
	 * 
	 * } //static method cannot be override
	 */
    
    
    public static void main(String[] args) {
		C obj = new C();
		obj.m1();
		obj.m2();
		obj.display();
		XYZ.methodThree();
    	
    	
    	
	}
	
	
}
