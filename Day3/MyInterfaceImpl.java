package com.training;

public class MyInterfaceImpl implements MyInterface{
	@Override
	public int addition(int x, int y, int z) {
		return x+y+z;
	}
	@Override
	public void sumOfTenNumbers(int n) {
	   int sum =0;
	   for(int i=0;i<=10;i++) {
		   sum=sum+i; //sum+=i
	   }
	  System.out.println("sum of ten numbers is : "+sum);
	}
	public static void main(String[] args) {
		MyInterface mob1 = new MyInterfaceImpl();
		int res=mob1.addition(10,30,50);
		System.out.println("sum of three numbers is : "+res);
		mob1.sumOfTenNumbers(10);
	}

}
