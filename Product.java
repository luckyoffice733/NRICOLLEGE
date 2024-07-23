package com.training;

public class Product {
	int pid;
	String pname;
	double price;
	//default constructor
	public Product() {
		//calling constructor in another cosntuctor using this
		this(1002,"monitor",5000); ////Product(int,String,double)
		System.out.println("we are  in default constructor");
		//this(1002,"monitor",5000); invalid
	}
	//parameterized constructor
	public Product(int pid,String pname,double price) {
		System.out.println("we are in parameterized constructor");
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	//instance method
	public void methodOne() {
		System.out.println("we are in method one");
	}
	//instance method
	public void display() {
		System.out.println("Product Details are :");
		System.out.println(this.pid+" "+this.pname+" "+this.price);
		this.methodOne(); //calling instance method in another instanc method
		
	}
	public static void main(String[] args) {
		Product pobj = new Product(); //created with default constructor
		pobj.display();
		
		/*
		 * Product pobj1 = new Product(1001,"mouse",500); pobj1.display();
		 */

	}
		
}
