package com.training.map;

import java.util.Collection;
import java.util.TreeMap;

public class ExampleOnTreeMap2 {
	public static void main(String[] args) {
		
		TreeMap<Integer,Book> tm = new TreeMap<Integer,Book>();
		Book b1 = new Book(21,"C","BalaGuruSwamy");
		Book b2 =new Book(32,"wingofire","Abdulkalam");
		Book b3 = new Book(42,"OtherSideofGandhiji","sasas");
		
		tm.put(1, b1);
		tm.put(2, b2);
		tm.put(3, b3);
		Collection<Book> c=tm.values();
		System.out.println("Book Details are :");
		for(Book b : c) {
			System.out.println(b.getBookId());
			System.out.println(b.getBookName());
			System.out.println(b.getAuthor());
			System.out.println("");;
		}
		
		
	}

}
