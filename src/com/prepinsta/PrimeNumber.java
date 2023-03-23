package com.prepinsta;

import java.util.Scanner;

/**
 * Example Input : 23 Output : Prime
 * 
 * @author nadim
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int no = sc.nextInt();

		int count = 0;
		if (no < 2) {
			System.out.println(" Given number is Not a primeNO");
		}

		for (int i = 1; i <= no; i++) {

			if (no % i == 0) {
				count += 1;
			}
		}

		if (count == 2) {
			System.out.println("prime");
		} else {
			System.out.println("Not prime");
		}
	}

}
