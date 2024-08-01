package com.training.java8features;

public class MyAppImpl{

  public static void main(String[] args) {
        //providing implementation for SAM using Lambda expression
		MyApp app =()->{System.out.println("we are implementing method "
				+ "using lambda expressiom");};
	  //-> -->lambda operator	
	  app.methodOne(); //calling the single abstract method
			
}
	
	
}
