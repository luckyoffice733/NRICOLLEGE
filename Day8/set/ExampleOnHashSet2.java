package com.training.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ExampleOnHashSet2 {
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		hs.add(90);
		hs.add(10);
		
		System.out.println(hs.size());
		System.out.println(hs);
		
		for(Integer i: hs) { //enchanced for loop
			System.out.println(i);
		}
		System.out.println("Using java8 lambda expression");
		hs.forEach(System.out::println);
		
	    //converting HashSet into ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		al.sort((i1,i2)->i1.compareTo(i2));
		System.out.println("Ascending order");
        System.out.println(al);	
        
        Collections.sort(al);
        System.out.println("Sorting the elements in ascending order "+al);
        //(i1,i2)->i2.compareTo(i1) -->Comparator class logic
        Collections.sort(al,(i1,i2)->i2.compareTo(i1));
        System.out.println("Sorting the elements in desending order "+al);
        
		
		
	}

}
