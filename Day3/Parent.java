package com.training;

public final class Parent {
 
	public void m1() {
		System.out.println("we are in m1 method parent");
	}
	
	public final void m2() {
		System.out.println("we are in m2 final method parent");	
	}
	
	public static void main(String[] args) {
		Parent pobj = new Parent();
		pobj.m1();
		pobj.m2();
		
	}
	
}
