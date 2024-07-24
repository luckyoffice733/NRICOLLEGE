package com.training;

import java.util.Scanner;

public class ExampleOnScanner2 {
	public static void main(String[] args) {
		Scanner scobj = new Scanner(System.in);  
    int collegeId=scobj.nextInt();
    scobj.nextLine();
    //String aboutsUs=scobj.next()+scobj.nextLine()
	String aboutsUs= scobj.nextLine();
	
	System.out.println(collegeId);
	System.out.println(aboutsUs);
		
	
	}

}
