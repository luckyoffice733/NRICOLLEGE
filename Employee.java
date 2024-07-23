package com.training;

public class Employee {

	int empId;
	String empName;
	double empSal;
	//default constructor
	public Employee() {
		// TODO Auto-generated constructor stub
		this(1001,"mouse",400);//calling constructor using this parameterized
		System.out.println("we are in defualt constructor");	
	}
	//Parameterized constructor
	public Employee(int empId, String empName, double empSal) {
		System.out.println("we are in parameterized constructor");
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public void methodOne() {
		System.out.println("we are in method One");
	}   
	public void display() {
		System.out.println("we are in display method");
		this.methodOne(); //calling method using this keyqword
	}
	
    public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.display();
	}

}
