package com.training.arrays;

public class ExampleOnArray5 {
 public static void main(String[] args) {
	//two dimensional array declaring and initialization
	int a[][] = {{1,2,3},{10,50,60}};
	
	System.out.println("displaying the elements using forloop");
	
	for(int i=0;i<2;i++) {//rows
		for(int j=0;j<3;j++) {//colums
			System.out.print(a[i][j]+" ");
		}
		System.out.println("");
	} 
}
}
