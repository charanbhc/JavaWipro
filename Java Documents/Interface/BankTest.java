package com.v2.Interface;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank savings = new SavingsBank();
		savings.deposit(1000);
		savings.withdraw(500);
	}

}
