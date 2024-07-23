package com.training;
public class ExampleOnTypeCasting {
	public static void main(String[] args) {
		int a=10;
		System.out.println("The value of a is : "+a);
		//converting int type to double
		double b =a;
		System.out.println("After Convert into double value  : "+b);
		char c='A';
		System.out.println("the character value is : "+c);	
		int ch=c;
		System.out.println("the character value is : "+ch);
		//narrowing or explicit casting using type cast(type)operator
		double d=100;
		System.out.println("the double value is : "+d);
		//converting double to int type
		int nd =(int)d;
		System.out.println("After converted from double to int : "+nd);
		char cd=(char)d;
		System.out.println("After converted from double to char : "+cd);
		
		
		

	}
	
}
