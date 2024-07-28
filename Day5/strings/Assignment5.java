package com.training.strings;

public class Assignment5 {
 public static void main(String[] args) {
	String a="sai";
	String b="shiv";
	 System.out.println("before swap");
	 System.out.println("a : "+a);
	 System.out.println("b : "+b);
	 
	 a=a+b;
	 b=a.substring(0,a.length()-b.length());
	 a=a.substring(b.length());
	 
	 System.out.println("After swap");
	 System.out.println("a : "+a);
	 System.out.println("b : "+b);
	 
	 
}
}
