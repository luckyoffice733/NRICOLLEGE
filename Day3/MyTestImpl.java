package com.training;
public abstract class MyTestImpl implements MyTest{
	@Override
	public int sumOfTennumbers(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	@Override
	public String concatTwoNames(String fname, String lname) {
		String fullName=fname+" "+lname;
		return fullName;
	}
	//Note:virtually this method available if not implemented
    //public abstract void m1(); 
}
