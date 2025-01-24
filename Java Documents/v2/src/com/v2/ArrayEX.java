package com.v2;

public class ArrayEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]	marks = {85,90,83,84,95};
		int total =0;
		for (int mark : marks) {
			total = total+mark;
		}
		double average = total / marks.length;
		System.out.println(total );
		System.out.println(average);
	}

}
