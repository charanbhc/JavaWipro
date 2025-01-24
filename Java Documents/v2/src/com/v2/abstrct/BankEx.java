package com.v2.abstrct;

abstract class Bank {

	abstract int rateOfInt();
}

class Sbi extends Bank {

	@Override
	int rateOfInt() {
		// TODO Auto-generated method stub
		return 10;
	}

}

class Axis extends Bank {

	@Override
	int rateOfInt() {
		// TODO Auto-generated method stub
		return 11;
	}

}

public class BankEx  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b= new Sbi();
		System.out.println(b.rateOfInt());
		b= new Axis();

	}

}
