package com.training.java8features;

public class A implements XYZ{

	@Override
	public void m1() {
	System.out.println("we are in A class of MethodOne");	
	}

	@Override
	public String sayHello(String m) {
		return "welcome "+m;
	}

	@Override
	public void m2() {
		System.out.println("we are in A class of MethodTwo");	
	}
	
	public static void main(String[] args) {
		A aobj = new A();
		aobj.m1();
		aobj.m2();
		String res =aobj.sayHello("Ramue");
		System.out.println(res);
		aobj.display();
		XYZ.methodThree(); //static method
	}

}
