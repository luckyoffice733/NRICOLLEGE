package com.training.arrays;

import java.util.Scanner;

public class ExampleOnArray7 {
 public static void main(String[] args) {
	Scanner  scobj = new Scanner(System.in);
	int r=scobj.nextInt();
	int c= scobj.nextInt();
	//declaring the array with row and column size
	int a[][] = new int[r][c];
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			System.out.println("Enter the elements at index positio a["+i+"]["+j+"]:");
			a[i][j]=scobj.nextInt();
		}
	}
	System.out.println("Display the elements from array");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
		  System.out.print(a[i][j]+" ");
		}
	 System.out.println(" ");
	}
}
}
