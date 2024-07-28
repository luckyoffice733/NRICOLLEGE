package com.training.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleOnFileReader {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		FileReader fr = new FileReader("D:\\temp\\Data.txt");
		
		int i = fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}	
		fr.close();		
	}
}
