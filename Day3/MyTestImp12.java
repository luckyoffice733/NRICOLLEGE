package com.training;
//Here this class extends from abstract class and providing implementation
//for unimplemented method
public class MyTestImp12 extends MyTestImpl{
	@Override
	public void m1() {
		// TODO Auto-generated method stub
	System.out.println("we are in method mo1 of MyTestImpl2");
	}
   
	public static void main(String[] args) {
		//interface reference holding its implementation class object
	  MyTest mtobj = new MyTestImp12();
	  mtobj.m1();
	 int res= mtobj.sumOfTennumbers(10);
	 String msg= mtobj.concatTwoNames("sumit","DeshPande");
	 System.out.println(msg);
	 System.out.println(res);
		
	}
}
