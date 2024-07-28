package com.training.io;

import java.io.FileWriter;
import java.io.IOException;

public class ExampleOnFileWriter {
	public static void main(String[] args) throws IOException {	
		FileWriter fw = new FileWriter("D:\\temp\\simple.txt");	
		fw.write(100);
		fw.write('a');
		fw.write("\n");
		char ch[] = {'b','a','a','d'};
		fw.write(ch);
		fw.write("\n");
		String sw = "welcome to files";
		fw.write(sw);
		fw.flush();
		fw.close();
		System.out.println("character is written into file");
	}
	
}
