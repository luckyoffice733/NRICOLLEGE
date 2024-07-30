package com.training.map;

import java.util.TreeMap;

public class ExampleOnTreeMap {
	public static void main(String[] args) {
		
		TreeMap<Object,Object>  hm = new TreeMap<Object,Object>();
		//to add the pair into the hm
		hm.put(10,"smith");
		hm.put("smith","jose");
		hm.put(10,"ramesh");//if key already exists it will overwrite the value.
		hm.put(true,'c');
		hm.put(20.0f,"hello");
		
		System.out.println(hm.size());
		System.out.println(hm);
		
		
		
		
		
		
		
		
	}

}
