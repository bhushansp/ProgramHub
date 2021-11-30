package com.te.abstractclass;

public abstract class Dog {
	double weight;
	int nails;
	String breed;
	
	public Dog(double weight, int nails, String breed) {
		super();
		this.weight = weight;
		this.nails = nails;
		this.breed = breed;
	}
	abstract void bark();
	abstract void bite();
	abstract void eat();
	public void poop(){
		System.out.println("It is pooping");
	}
}
