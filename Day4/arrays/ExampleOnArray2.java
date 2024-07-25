package com.training.arrays;
public class ExampleOnArray2 {
	public static void main(String[] args) {
		//declaring size and initialize with index
		int a[] = new int[5];
		a[0]=30;
		a[1]=20;
		a[2]=50;
		a[3]=60;
		a[4]=70;
		System.out.println("Displaying arrray elements "
				+ "using for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Displaying arrray elements "
				+ "using enhaned for loop");
		for(int b:a) {
			System.out.println(b);
		}
	}
}
