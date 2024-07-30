package com.training.set;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleOnHashSet1 {
  public static void main(String[] args) {
	
	    HashSet<Object> hs = new HashSet<Object>();
	    hs.add("HI");
	    hs.add(10);
	    hs.add(10.0f);
	    hs.add('c');
	    hs.add(true);
	    hs.add(10);

	    System.out.println("No of elements is : "+hs.size());
	    System.out.println(hs);
	    boolean b =hs.contains("10");
	    System.out.println("Search is found or not ? : "+b);
	    
	    Iterator<Object> iobj= hs.iterator();
	    while(iobj.hasNext()) {
	    	System.out.println(iobj.next());
	    }
	    
	    hs.remove('c');
	    System.out.println("After Remove:");
	    System.out.println(hs);
	  
}
}
