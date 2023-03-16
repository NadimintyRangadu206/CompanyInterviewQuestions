package com.interview.question;

public class ValetParking {

	public static void main(String[] args) {

		ManagerImpl mi = new ManagerImpl();

		mi.checkIn();
		mi.displayValetParkingList();
		mi.searchForVehicle();
		mi.checkOut();
	}

}
