package com.training.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleOnBufferedReader1 {
  public static void main(String[] args) throws FileNotFoundException,IOException {
	FileReader fr = new FileReader("D:\\temp\\Data.txt");
	BufferedReader br = new BufferedReader(fr);
	   
	String line = br.readLine(); //firstline
	while(line!=null) {
	System.out.println(line);
	line=br.readLine();
	}
   br.close();
   fr.close(); 
	  
}
}
