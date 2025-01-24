package com.package1.polymorphism;


class Animal {
	void speak() {
		System.out.println("Animal make some sound1");
	}
	
}

public class TestOverrideing extends Animal {
	
	void speak() {
		super.speak();
		System.out.println("Animal make some sound 2");
	}
	
	public static void main(String[] args) {
		
		TestOverrideing t = new TestOverrideing();
		t.speak();
	}

}
