package com.training.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleOnBufferWriter1 {
	public static void main(String[] args) throws IOException {	
		FileWriter fw = new FileWriter("D:\\temp\\tempData.txt");
		BufferedWriter bw = new BufferedWriter(fw);	
		bw.write(100);
		bw.write('a');
		bw.newLine();
		char ch[] = {'b','a','a','d'};
		bw.write(ch);
		bw.newLine();
		String sw = "welcome to files";
		bw.write(sw);
		bw.flush();
		bw.close();
		System.out.println("character is written into file using buffered writer");
	}
	
}
