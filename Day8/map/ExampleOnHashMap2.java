package com.training.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleOnHashMap2 {
	public static void main(String[] args) {

		HashMap<Integer,String>  hm = new HashMap<Integer,String>();
		
		hm.put(321,"smith");
		hm.put(101,"riyan");
		hm.put(104,"ramesh");
		hm.put(201,"martin");
		hm.put(3121,"sariya");
		
		System.out.println("no of pairs is : "+hm.size());
		System.out.println(hm);
		
		System.out.println("Searching a value");
		boolean b =hm.containsValue("ramesh");
		System.out.println("Search is found or not ?: "+b);
		
		System.out.println("Searching a key");
		boolean b1 =hm.containsKey(101);
		System.out.println("Search is found or not ?: "+b1);
		
		//get the value based on Key
		String gv=hm.get(101);
		System.out.println("Getting the value based on key: "+gv);
		//replace(key,oldvalue,newvalue);
		hm.replace(201,"martin","scott");
		System.out.println("After The Replace");
		System.out.println(hm);
		
		String rv=hm.remove(3121); //3121,sariya delete the pair and return sariya
		System.out.println("The removed value based on key 3121: "+rv);
		System.out.println("After remove");
		System.out.println(hm);
		
		//getting only keys
		Set<Integer> kys=hm.keySet();
		System.out.println("Keys are : ");
		System.out.println(kys);
		System.out.println("Displaying keys using enhabnce forloop");
		for(Integer i: kys) {
			System.out.println(i);
		}
		
		//get the values from hashmap
		Collection<String> c=hm.values();
		System.out.println("Displaying values using enhabnce forloop");
		for(String i: c) {
			System.out.println(i);
		}
		
		//converting Collection object c into ArrayList al
		System.out.println("Elements from arraylist");
		ArrayList<String> al = new ArrayList<>(c);
		System.out.println(al);
		
		System.out.println("Displaying the keys and values using entrySet");
		Set<Entry<Integer,String>> keyvals=  hm.entrySet();
		System.out.println("Displaying keys and values  using enhanced forloop");
		
		for(Entry<Integer,String> kv: keyvals) {
			System.out.println(kv.getKey()+" "+kv.getValue());
		}
		
		
		
		
	}
}