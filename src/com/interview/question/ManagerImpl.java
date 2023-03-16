package com.interview.question;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ManagerImpl implements ManagerFunc {

	List<VehicleInfo> list = new ArrayList<>();

	@Override
	public void checkIn() {

		VehicleInfo vi = new VehicleInfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String customerName = sc.next();

		if (!customerName.equalsIgnoreCase(vi.getCustomerName())) {
			System.out.println("Enter VehicleNo:");
			vi.setVehicleNo(sc.nextInt());
			System.out.println("Enter VehicleType:");
			vi.setVehicleType(sc.next());
			System.out.println("Enter VehicleModel:");
			vi.setVehicleModel(sc.next());
			System.out.println("Enter PhoneNo");
			vi.setPhoneNo(sc.next());
			System.out.println("Enter CustomerName");
			vi.setCustomerName(sc.next());
			System.out.println("Enter Time");
			long n = sc.nextLong();
			vi.setTime(new Time(n));

			list.add(vi);

		} else {
		System.out.println("Does not match the Customer Name");
		}
	}

	@Override
	public void displayValetParkingList() {

		System.out.println("Display the ValetParkingDetails:");
		Iterator<VehicleInfo> it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

	@Override
	public void searchForVehicle() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle No");
		Integer vehicleNo = sc.nextInt();

		for (VehicleInfo retrive : list) {

			if (vehicleNo.equals(retrive.getVehicleNo())) {

				System.out.println("Display the Vehicle Information:" + "\n" + retrive);
			} else {
				System.out.println("Does not Matching VehicleNo");
			}

		}

	}

	@Override
	public void checkOut() {

		Double charge = 10.0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 60; i++) {
			System.out.println("Enter a Time in minit");
			int min = sc.nextInt();
			min = i;
			if (i >= 0 && i <= 30) {
				System.out.println("Pay the Money" + "\n" + charge);
			} else {
				if (i > 31 && i <= 60) {
					charge++;
					System.out.println("Extra Amount pay the Customer+" + "\n" + charge);
				}
			}
		}

	}

}
