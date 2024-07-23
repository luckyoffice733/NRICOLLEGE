package com.training;

public class ExampleOnMVD2 {
	public int add(int a, int b) {
		System.out.println("we are in add method of int");
		return a+b;
	}
	public long add(long x, long y) {
		System.out.println("we are in add method of long");
		return x+y;
	}
	public float add(float a,float b) {
		System.out.println("we are in add method of float");
		return a+b;
	}
	public double add(double a, double b) {
		System.out.println("we are in add method of double");
		return a+b;
	}
	
	public static void main(String[] args) {
		ExampleOnMVD2 eovd2 = new ExampleOnMVD2();
		System.out.println(eovd2.add(100,20)); //add(int,int)
		System.out.println(eovd2.add(13l,14L));//add(long,long)
		System.out.println(eovd2.add(30.0f,50.0F));//add(float,float)
		
		
	}
	
	
}
