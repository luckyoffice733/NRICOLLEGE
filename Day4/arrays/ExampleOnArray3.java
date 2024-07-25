package com.training.arrays;

import java.util.Scanner;

public class ExampleOnArray3 {
	public static void main(String[] args) {
		//declaring size and initialize with elements in array using Scanner
		Scanner  scobj = new Scanner(System.in);		
		int a[] = new int[5];
	   //using scanner class initializing the array
		for(int i=0;i<a.length;i++) {
		System.out.println("Enter the element at index position : a["+i+"]");
		a[i]=scobj.nextInt();
		}
		System.out.println("Displaying arrray elements using for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Displaying arrray elements using enhaned for loop");
		for(int b:a) {
			System.out.println(b);
		}
		


	}
}
