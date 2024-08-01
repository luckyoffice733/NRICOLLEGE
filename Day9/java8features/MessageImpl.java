package com.training.java8features;

public class MessageImpl {
	public String m1() {
		return "welcome to methodreference using :: from m1";
	}
	public static String m3() {
		return "welcome to methodreference using static method:: from m1";
	}
	
   public static void main(String[] args) {
	
	  // Message mg =()->"welcome to methodreference";
	  //replacing lambda expression with methodReference using ::
	  //creating the object
	   MessageImpl mgimp = new MessageImpl();
	  
	  //providing implementation using methodReference for the SAM using
	  //instance method using  object reference
	  Message mg = mgimp::m1;
	   
	  String m=mg.sayHello();
	  System.out.println(m);
	  
	 //providing implementation using methodReferene for the SAM using static method reference
	  Message mg1=MessageImpl::m3;
	   
	  String m1=mg1.sayHello();
	  System.out.println(m1);
	  
}
}
