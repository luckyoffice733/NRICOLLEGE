package com.training;
//method overloading using automatic type promotion
public class ExampleOnMVD3 {  //byte->short->int->long->float->double
	/*
	 * public void m1(char c,char d) { System.out.println("we are in m1 of char");
	 * System.out.println(c+" "+d); }
	 */
	 public void m1(double a,double b) {
    	 System.out.println("we are in m1 of double");
    	 System.out.println("sum is : "+(a+b));
     }
	public static void main(String[] args) {
		ExampleOnMVD3 eovd3 = new ExampleOnMVD3();
		eovd3.m1('a','a');//m1(char,char)->
		eovd3.m1(10,20);//m1(int,int)->m1(long,long)->m1(float,float)->m1(double,double)
		
	}
     
}
