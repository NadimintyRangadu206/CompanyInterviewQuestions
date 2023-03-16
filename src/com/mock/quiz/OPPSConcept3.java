package com.mock.quiz;

class Bike {
	static {
		System.out.print("1");
	}

	public Bike(String name) {
		super();
		System.out.print("2");
	}

	{
		System.out.print("3");
	}
}

class BlueCar extends Bike {
	{
		System.out.print("4");
	}

	public BlueCar() {
		super("blue");
		System.out.print("5");
	}

}

public class OPPSConcept3 {

	public static void main(String[] args) {

		new BlueCar();
	}

}
