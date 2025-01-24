package com.v2.Interface;


// depost withdraw        amount balance
public class SavingsBank  implements  Bank{
	private double balance;
	

	@Override
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("diposited"+ amount);
		
	}

	@Override
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance = balance-amount;	
			System.out.println("withdraw"+ amount);
		}else {
			System.out.println("insufficient");
		}
		
	}
	
	public double getBlance() {
		return balance;
		
	}

}
