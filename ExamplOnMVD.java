package com.training;
//methodOverloading
public class ExamplOnMVD {
   //method signature 
   //m1(String)
	public void m1(String m1) {
		System.out.println("welcome " +m1);
	}
	public int m1(int a, int b) { //m1(int,int)
		return a+b;
	}
	public double m1(int a, int b,int c) { //m1(int,int,int)
		return a+b+c;
	}
	public static void main(String[] args) {
		ExamplOnMVD  eomd = new ExamplOnMVD();
		eomd.m1("raju"); //m1(String)
		int res =eomd.m1(10,20);//m1(int,int)
		double res1=eomd.m1(30,40,50);
		System.out.println("sum of two numbers is : "+res);
		System.out.println("sum of three numbers is : "+res1);
	}
	
	
	

}
