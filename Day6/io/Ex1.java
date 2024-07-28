package com.training.io;

import java.io.File;

public class Ex1 {
  public static void main(String[] args) {
	
	  File f  = new File("D:\\temp");
	  System.out.println(f.isDirectory());
	  System.out.println(f.isFile());
	  int count=0;
	  if(f.isDirectory()) {
		  String st[]=f.list();
		  for(int i=0;i<st.length;i++) {
			 System.out.println(st[i]);
			 ++count;
		  }
	  }
	  System.out.println("no of files in given directory temp : "+count);
	  	  
}
}
