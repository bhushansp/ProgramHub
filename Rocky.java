package com.te.abstractclass;

public class Rocky extends Dog {
	
	public Rocky(double weight, int nails, String breed) {
		super(weight, nails, breed);
		// TODO Auto-generated constructor stub
	}


	public void bark(){
		System.out.println("Ba ba");
		
	}

	
	public void bite() {
		System.out.println("It has a sharp teeth but not bite");
		
	}

	
	public void eat() {
		System.out.println("chicken, Roti and Milk");
		
	}
}
