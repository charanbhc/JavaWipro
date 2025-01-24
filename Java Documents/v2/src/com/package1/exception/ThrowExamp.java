package com.package1.exception;

public class ThrowExamp {

	public static void main(String[] args) throws ArithmeticException,ClassNotFoundException {
		// TODO Auto-generated method stub
int age =15;

 if(age <18) {
	 throw new IllegalArgumentException("Age must be greater then 18");
 }
 System.out.println("you are eligible to vote");
	}

}
