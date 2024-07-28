package com.training.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleOnPrintWt {
public static void main(String[] args)throws IOException {
	FileWriter fw = new FileWriter("D:\\temp\\employeeData.txt");
    PrintWriter pw = new PrintWriter(fw);
	
    pw.write(97);
    pw.write('d');
    pw.write("\n");
    
	pw.println("welcome to files");
	pw.println(true);
	pw.println(141L);
	pw.println(1022.0f);
	pw.println("best reader is buffered reader and best writer printWriter");
	pw.close();
	fw.close();
    System.out.println("characters written into file using pw");
   
}
}
