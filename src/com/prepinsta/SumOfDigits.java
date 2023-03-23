package com.prepinsta;

import java.util.Scanner;


/**
 * Example
  Input : 1234
  Output : 1 + 2 + 3 + 4 = 10
  
 * @author nadim
 *
 */
public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = sc.nextInt();

		int sum = 0;
		int r = 0;		
		
		while(num1!=0) {                     // Method-1
			r = num1 % 10;
			sum = sum + r;
			num1 = num1 / 10;
		}
		System.out.println(sum);
		
		
		System.out.println("Enter a Number");       // Method-2
		String str=sc.next();
		int no=0;
		for(int i=0;i<str.length();i++) {
			
		no+= Integer.valueOf(str.charAt(i))-48;       // Using Ascii table
	
		}
		System.out.println(no);
	}

}
