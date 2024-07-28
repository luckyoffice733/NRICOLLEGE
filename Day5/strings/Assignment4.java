package com.training.strings;

import java.util.Scanner;

public class Assignment4 {
	
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		String name="";
		System.out.println("Enter the your name");
		String s = sobj.nextLine();
		
		String st[] = s.split(" ");
		//System.out.println(st[0].charAt(0)+"."+st[1].charAt(0)+"."+st[2]);
		for(int i=0;i<st.length;i++) {
			if(i<=st.length-2) {
		     name=name+st[i].substring(0,1)+".";
			}else {
				name=name+st[i];
			}
		}
		System.out.println(name);
	}

}
