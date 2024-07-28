package com.training.strings;

public class ExampleOnString {
   public static void main(String[] args) {
	String s=new String("welcome");
	System.out.println("Hascode : "+s.hashCode()+" "+s);
	s=s.concat(" to NRI");
	System.out.println("Hascode : "+s.hashCode()+" "+s); 
	   
	   
}
}
