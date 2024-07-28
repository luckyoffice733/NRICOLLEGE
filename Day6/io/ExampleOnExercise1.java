package com.training.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleOnExercise1 {
public static void main(String[] args) throws IOException {
	PrintWriter pw = new PrintWriter("D:\\temp\\output.txt");
	BufferedReader br1 =new BufferedReader(new FileReader("D:\\temp\\abc.txt"));
	BufferedReader br2 =new BufferedReader(new FileReader("D:\\temp\\xyz.txt"));
	
	String l1 = br1.readLine();
	String l2  = br2.readLine();
	
	while(l1!=null || l2!=null) {
		if(l1!=null) {
			pw.println(l1);
			l1=br1.readLine();
		}
		if(l2!=null) {
			pw.println(l2);
			l2=br2.readLine();
		}
	}
   br1.close();
   br2.close();
   pw.close();
}
}
