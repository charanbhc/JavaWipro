package com.package1.exception;

import java.util.Scanner;

public class DivisionExamp { // num denomen

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the numerator");
			int numerator = sc.nextInt();
			System.out.println("Enter the denomentor");
			int denomentor = sc.nextInt();

			int result = devide(numerator, denomentor);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		} finally {
			System.out.println("Execution is completed /");
		}
	}

	private static int devide(int numerator, int denomentor) throws ArithmeticException {
		if (denomentor == 0) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
		return numerator / denomentor;
	}

}
