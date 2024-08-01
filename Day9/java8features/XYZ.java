package com.training.java8features;

public interface XYZ {
     public void m1();
     public String sayHello(String m);
     public void m2();
     default void display() {
    	 System.out.println("we are in default method");
     }
     
     static void methodThree() {
    	 System.out.println("we are in static method this logic is fixed");
     }
}
