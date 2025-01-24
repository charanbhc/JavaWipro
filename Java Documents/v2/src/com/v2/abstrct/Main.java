package com.v2.abstrct;


abstract class Bike{
	 abstract void run() ; //unimplemented abstract  dosnt have a body
	 void stop() {
		System.out.println("stopped"); 
	 }
	
}

public class Main extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike m = new Main();
		m.run();
		m.stop();
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("bike is running");
	}

}
