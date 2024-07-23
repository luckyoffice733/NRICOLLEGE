package com.training;

public class Test {

	public static void main(String[] args) {
		
      Item  obj = new Item();
      //initializing the private instance variables using setter method
		obj.setItemId(1001);
		obj.setItemName("latops");
		obj.setItemPrice(50000);
		
    //accessing the data from the private instance variables using getter
	//getter methods
		System.out.println("Item Details are : ");
		System.out.println(obj.getItemId());
		System.out.println(obj.getItemName());
		System.out.println(obj.getItemPrice());	
		
	}
}
