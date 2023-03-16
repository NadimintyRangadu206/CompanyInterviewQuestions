package com.mock.quiz;

class Base {

	Base() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public Derived() {
		System.out.println("Derived");
	}
}

class DeriDerived extends Derived {
	public DeriDerived() {

		System.out.println("DeriDerived");
	}
}

public class OPPSConcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          Derived d= new DeriDerived();
          

	}

}
