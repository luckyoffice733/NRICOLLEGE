package com.training;

public class ExampleOnInterface2 implements MyInt1,MyInt2{
	@Override
	public void m2() {
     System.out.println("we are in m2 method");	
	}
	@Override
	public int addition(int a, int b) {
		return a+b;
	}
	@Override
	public void m1() {
     System.out.println("we are in m1 method");
	}
	@Override
	public String sayHello(String m) {
		return "welcome "+m;
	}
	public static void main(String[] args) {
	//2ndway
		ExampleOnInterface2 eof1 = new ExampleOnInterface2();
		eof1.m1();
		eof1.m2();
		System.out.println("sum of two numbers : "+eof1.addition(10,20));
		System.out.println(eof1.sayHello("smith"));	
	}
	
}
