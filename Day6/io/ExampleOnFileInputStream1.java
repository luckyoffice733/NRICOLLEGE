package com.training.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExampleOnFileInputStream1 {
	
	public static void main(String[] args) throws IOException {
	   File fs = new File("D:\\temp\\Data.txt");
		FileInputStream fis = new FileInputStream(fs);
		
		int i =fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
		
		fis.close();
		
	}

}
