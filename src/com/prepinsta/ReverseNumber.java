package com.prepinsta;

import java.util.Scanner;

/**
 * Example
   Input : 123
    Output : 321
 * @author nadim
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = sc.nextInt();
		
		int r=0; int reverse=0;
		while(num1!=0) {
			
			r=num1%10;
			reverse=(reverse*10)+r;
			num1=num1/10;
		
		}
		System.out.println(reverse);
		

	}

}
