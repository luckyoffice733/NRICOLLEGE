package com.training;

public class Student {
    //instance variables
	int studentId;
	String studentName;
	int marks;
	static String collegeCode="kp"; //static variable
	
	//instance method
	public void studentDetails() {
	  System.out.println("Student details are : ");
	  System.out.println("Student Id is : "+this.studentId);
	  System.out.println("Student Name is : "+this.studentName);
	  System.out.println("Student marks is : "+this.marks);
	  System.out.println("static variables: "+Student.collegeCode);
	}   
	public static void main(String[] args) {
		
		  Student stu = new Student(); 
		  stu.studentDetails();
		 
		  Student stu1 = new Student(); 
		  stu1.studentDetails();
		   
			  Student stu2 = new Student(); //initializing the instance variables without
			  stu2.studentId=101; 
			  stu2.studentName="martin"; 
			  stu2.marks=70;
			  stu2.studentDetails();
			 
		  System.out.println("Calling static variable");
		  System.out.println(collegeCode); //
		  System.out.println(Student.collegeCode);//REcommedened
		  //System.out.println(stu.collegeCode);
		  
		  //System.out.println(this.studentId);
		  
	}
	
	
}
