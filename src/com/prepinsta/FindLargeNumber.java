package com.prepinsta;

import java.util.Scanner;

/**
 * Method 1: Using if-else Statements
   Method 2: Using Ternary Operator
   Method 3: Using inbuilt max Function
   
 * @author nadim
 *
 */
public class FindLargeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a Number2");
		int num2 = sc.nextInt();
		
		
		
		if(num1==num2) {                              // Method-1
			System.out.println("Both numbers are Equal");
		}else if(num1>num2)
			 {
			System.out.println("Num1 is LargerNumber");
			}
		else {
			System.out.println("Num2 is largerNumber");
		}
		
		
		System.out.println();
		
		
		
		if(num1==num2) {                               // Method-2
			System.out.println("Both numbers are Equal");
		}else {
			String check=num1>num2?"Num1 is LargerNumber":"Num2 is LargerNumber"; // Ternary Operator
			System.out.println(check);
		}
		
		System.out.println();
		
		
		
		int max=Math.max(num1, num2);                  // method-3
		System.out.println(max);

	}

}
