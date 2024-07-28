package com.training.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleOnFileOutStream1 {
 public static void main(String[] args) throws FileNotFoundException,IOException {
	File f =new File("D:\\temp\\product.txt");
	FileOutputStream fos =new FileOutputStream(f);
	 
	fos.write(100);
	fos.write('s');
	fos.write('\n');
	byte ft[] = {'a','b','d'};
    fos.write(ft);
    fos.flush();
    fos.close();
	
	 
	 
	 
}
}
