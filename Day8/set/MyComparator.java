package com.training.set;

import java.util.Comparator;

public class MyComparator implements Comparator<Customer>{
   //custom logic based on custID field for TreeSet 
	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		int c1 = o1.getCustId();   //sort code base onn id
		int c2= o2.getCustId();
		if(c1<c2) {
			return -1;
		}else if(c1>c2) {
			return 1;
		}else {
			return 0;
			}
		
		
		/*
		 * String s1 =o1.getCustName(); String s2 = o2.getCustName(); return
		 * s1.compareTo(s2);
		 */
	}
	}	

