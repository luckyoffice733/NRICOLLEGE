package com.training.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleOnLinkedHashSet1 {
  public static void main(String[] args) {
	
	  LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
	  
	  lhs.add(null);
	  lhs.add(10);
	  lhs.add(30);
	  lhs.add(50);
	  lhs.add(10);
	  lhs.add(100);
	  lhs.add(60);
	  
	  System.out.println("No of the elements : "+lhs.size());
	  System.out.println("Insertion order is preseved in LinkedHashSet");
	  System.out.println(lhs);
	  
	  Iterator<Integer> iobj = lhs.iterator();
	  while(iobj.hasNext()) {
		  System.out.println(iobj.next());
	  }
	  ArrayList<Integer> al= new ArrayList<Integer>(lhs);
	  try {
	  Collections.sort(al);
	  }catch(NullPointerException ae) {
		  System.out.println("Null values exist sort cannot be happend");
	  }
	  System.out.println("ascending : "+al);
	  
	  
	  
}
}
