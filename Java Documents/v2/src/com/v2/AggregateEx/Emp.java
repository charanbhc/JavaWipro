package com.v2.AggregateEx;





public class Emp {
	int id ;
	String name;
	Address address;
	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address =address;
	}


	
	
	void disply() {
		
	System.out.println(id + ","+ name);	
	System.out.println(address.city+ ""+address.State+""+address.Country);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1 = new Address("hyd", "tg", "Ind")	;
		Address a2 = new Address("Vizag", "ap", "ind")	;
		Emp e1 = new Emp(1, "Raj", a2);
		Emp e2 = new Emp(1, "Raj", a1);
		e1.disply();
		
		
		

	}

}
