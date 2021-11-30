package com.te.abstractclass;

public class Zoey extends Dog {

	public Zoey(double weight, int nails, String breed) {
		super(weight, nails, breed);
		// TODO Auto-generated constructor stub
	}

	@Override
	void bark() {
		System.out.println("Bow-Bow");
		
	}

	@Override
	void bite() {
		System.out.println("Not bite ");
		
	}

	@Override
	void eat() {
		System.out.println("Chicken,Mutton,etc");
		
	}

}
