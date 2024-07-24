package com.training;

public class ExampleOnInterface implements I2 {
	@Override
	public String sayHello(String m) {
		// TODO Auto-generated method stub
		return "welcome "+m;
	}
	@Override
	public int addition(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	@Override
	public void display() {
		System.out.println("we are in displayMethod");
		
	}
	public static void main(String[] args) {
	//Interface referenceVariable holding its implementation class Object
	 I2 iobj = new ExampleOnInterface();
	 int res=iobj.addition(10,40,50);
	 System.out.println("sum of three numbers : "+res);
	 System.out.println(iobj.sayHello("ramu"));	
	}
}
