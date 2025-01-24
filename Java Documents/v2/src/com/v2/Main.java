package com.v2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();

		 Car c1 = new Car("Red", "volvo");
		 c1.disply();
		 Car c2 = new Car("blue", "volvo1");
		 Car c3 = new Car("Red1", "volvo2");
		 System.out.println(c1.color + ","+ c1.model);
		 System.out.println(c2.color + ","+ c2.model);
		 System.out.println(c3.color + ","+ c3.model);
		
	}

}
