package com.prepinsta;

import java.util.Scanner;

/**
 *    Example
      Input : 121
      Output : Palindrome
 * @author nadim
 *
 */
public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = sc.nextInt();

		int r = 0;
		int reverse = 0;
		int temp = num1;

		while (num1 != 0) {

			r = num1 % 10;
			reverse = (reverse * 10) + r;
			num1 = num1 / 10;
		}

		if (temp == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
