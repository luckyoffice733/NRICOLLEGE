package com.training;

public class ExampleInterface3 extends MyInt3 implements MyInt4{
	
	@Override 
	public void m2() {
	System.out.println("we are in method2");
	}
	@Override
	public String sayHello(String m) {
		return "weclome "+m;
	}

	public static void main(String[] args) {
		ExampleInterface3 eov3= new ExampleInterface3();
		int res=eov3.addititon(10,20);
		System.out.println("sum is : "+res);
		eov3.m1();
		eov3.m2();
		System.out.println(eov3.sayHello("ramu"));
		
		
	}

	

}
