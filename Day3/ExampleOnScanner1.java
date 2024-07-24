package com.training;
import java.util.Scanner;
public class ExampleOnScanner1 {
   
	public static void main(String[] args) {
	//creating the Scanner class Object
	Scanner scobj = new Scanner(System.in);  
	System.out.print("Enter the Student id: ");
	int studentID = scobj.nextInt();
	System.out.print("Enter the Student Name : ");
	String studentName=scobj.next()+scobj.nextLine();
	System.out.print("Enter the Student marks: ");
	double marks = scobj.nextDouble();
	
	System.out.println("Student Details are:");
	System.out.println(studentID+" "+studentName+" "+marks);   
}
}
