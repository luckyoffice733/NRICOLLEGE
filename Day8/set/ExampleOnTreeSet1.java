package com.training.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleOnTreeSet1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(40);
		ts.add(10);
		//ts.add(null); treeset doest not allow null values
		ts.add(50);
		ts.add(40);
		ts.add(5);
		
		System.out.println("no of elements : "+ts.size());
		System.out.println("Natural sorting order (ascending order)");
		System.out.println(ts);
		
		boolean b =ts.contains(50);
		System.out.println("Search is fount or not ? : "+b);
		
		ts.remove(5);
		
		System.out.println("After remove an object from ts");
		System.out.println(ts);
		System.out.println("Descending order:");
		Iterator<Integer> iobj =ts.descendingIterator();
		while(iobj.hasNext()) {
			System.out.print(iobj.next()+" ");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
