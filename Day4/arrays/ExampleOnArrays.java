package com.training.arrays;

public class ExampleOnArrays {
	
public static void main(String[] args) {

	//declare and initialization of array;
    int a[] = {10,20,30,40,50};
    
    System.out.println(a);
    System.out.println("Length of an array is : "+a.length);
    
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
