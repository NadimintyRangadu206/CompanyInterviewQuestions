package com.prepinsta;

import java.util.Scanner;

/**
 * Find the Sum of First N Natural Numbers in Java
 * 
 * Input : num = 5
   Output : 15

   Where first 8 number is 1, 2, 3, 4, 5
   Sum of numbers = 1 + 2 + 3 + 4 + 5 = 15
 * @author nadim
 *
 */
public class SumOfNaturalNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {// method-1
			sum += i;
		}
		System.out.println(sum);
		System.out.println();

		
	// formula : no*(no+1)/2
		
		int count = num * (num + 1) / 2;// method-2  
		System.out.println(count);
	}
	

}
