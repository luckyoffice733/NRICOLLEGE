package com.training;

public class Chair {
	
	//properties of an object
	//instance variabes
	int noOfWheels=5;
	String color="black";
	String material="plastic";
	
	//behaviours or actions of chair object
	//instance method or complete method or concrete method
	public void chairIsMovieable() {
		System.out.println("Chair  is movieable");
	}
	
	public static void main(String args[]) {
	 //creating the object using new operator
	  Chair cobj = new Chair();
	  System.out.println("Chair properties are : ");
	  System.out.println("Chair color is : "+cobj.color);
	  System.out.println("Chair Weels is : "+cobj.noOfWheels);
	  System.out.println("Chair material is : "+cobj.material);
	  cobj.chairIsMovieable(); 
		
		
		
	}
	
	

}
