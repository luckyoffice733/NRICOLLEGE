package com.training.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleOnTreeSet2 {
	public static void main(String[] args) {
		
		TreeSet<Customer> hs = new TreeSet<Customer>(new MyComparator());
		
		Customer c1 =new Customer(101,"smith","Boston");
		Customer c2= new Customer(102,"martin","NewJersey");
		//System.out.println(c1);
		Customer c4 =new Customer(101,"smith","Boston");
	
		hs.add(c1);
		hs.add(c2);
		hs.add(c4);
		hs.add(new Customer(103,"scott","chicago"));
		System.out.println("no of customer object stored is :"+hs.size());
		System.out.println(hs);
		
	    Iterator<Customer> ct = hs.iterator();
	    System.out.println("Customer Details are :");
	    while(ct.hasNext()) {
	    	Customer c = ct.next();
	    	System.out.println(c.getCustId()+" "+c.getCustName()+" "+c.getAddress());
	    }
		
		
	}
	
}
