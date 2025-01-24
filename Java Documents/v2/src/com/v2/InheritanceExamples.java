package com.v2;

class Animal {
	// am static return/ method( )
	void eat() {

		System.out.println("i am eating ");
	}
}

class Dog extends Animal {

	void bark() {
		System.out.println("Dog is barking ");
	}

}

class BabyDog extends Dog {
	void weep() {
		System.out.println("weepiing ");
	}

}

public class InheritanceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog b = new BabyDog();
		b.weep();
		b.bark();
		b.eat();

	}

}
