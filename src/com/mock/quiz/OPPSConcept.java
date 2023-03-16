package com.mock.quiz;


class AutoMobile {
	 private    String drive() {
		 
		 return "Vechicle Driver";
	 }
} 
class Car extends AutoMobile{
	
	protected String driver() {
		
		return "Car Driver";
	}
}

 class ElectrcalCar extends Car{
	
	 public String driver() {
		 return "Electrical Driver";
	 }
}
public class OPPSConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutoMobile c= new AutoMobile();
//		c.drive();

	}

}
