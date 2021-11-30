package com.te.abstractclass;

public class Owner {

	public static void main(String[] args) {
		Rocky rocky = new Rocky(40, 20, "Labrador");
		rocky.bark();
		rocky.bite();
		rocky.eat();
		rocky.poop();
		System.out.println("weight" +rocky.weight);
		System.out.println("nails" +rocky.nails);
		System.out.println("breed" +rocky.breed);
		System.out.println("*******************************************************************************************");
		
		Ginnie ginnie = new Ginnie(45, 25, "pug");
		ginnie.bark();
		ginnie.bite();
		ginnie.eat();
		ginnie.poop();
		System.out.println("*******************************************************************************************");
		
		Zoey zoey = new Zoey(20, 15, "German");
		zoey.bark();
		zoey.bite();
		zoey.eat();
		zoey.bite();
		System.out.println("*******************************************************************************************");
		
		
	}

}
