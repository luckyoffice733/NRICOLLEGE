package com.training.java8features;

public class MyTestImpl {

public static void main(String[] args) {
	
	MyTest myt=(x,y)->x+y; //using lambda logic
	
   //calling the lambda expression
	int sum =myt.addition(10,50);
	System.out.println("sum of two numbers is : "+sum);
	
}
}
