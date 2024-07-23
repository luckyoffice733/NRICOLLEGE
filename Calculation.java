package com.training;

public class Calculation {
	public int calculateSum(int n) { //called method
		int sum =0;
		
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum; 
	}
	public static void main(String[] args) {
		Calculation cobj = new Calculation();
		int resum=cobj.calculateSum(20);//calling a method
		System.out.println("Sum of first n naturals divisble by 3 or 5 : "+resum);
		
	}	
}
