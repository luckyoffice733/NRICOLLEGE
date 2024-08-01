package com.training.java8features;

public class B implements XYZ{

	@Override
	public void m1() {
	System.out.println("we are in B class of MethodOne");	
	}

	@Override
	public String sayHello(String m) {
		return "welcome "+m;
	}

	@Override
	public void m2() {
		System.out.println("we are in B class of MethodTwo");	
	}
    public static void main(String[] args) {
    	B bobj = new B();
		bobj.m1();
		bobj.m2();
		String res =bobj.sayHello("smith");
		System.out.println(res);
		bobj.display();
		XYZ.methodThree();
	}
	
	
}
