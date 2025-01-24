package com.package1.exception;

public class WithAndWithoutEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" i am starting to write a program");
		int[] numbers = {1,2,3};
		try {
			System.out.println("I need to get the 5 th element "+numbers[5] );
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : index is out of bound"+ e.getMessage());
		}finally {
			System.out.println("error caught ");
		}
		System.out.println("I need to get the 5 th element "+numbers[2] );
		
		System.out.println("progrma is completed");
	}

}
