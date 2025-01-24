package com.v2;



public class EncapEx {

	private int age ; //negetive 
	 
	
	
	public int getAge() {
		return age;
	}

//int total/5   double v = 

	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}else {
			System.out.println("aage must be positive");
		}
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapEx en = new EncapEx();
		en.setAge(-5);
		
	}

}
