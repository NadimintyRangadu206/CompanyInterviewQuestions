package com.prepinsta;

import java.util.Scanner;
/**
Armstrong Numbers
Example
Input : 371
Output : It's an Armstrong Number.
Explanation: 371 = 3^3 + 7^3 + 1^3
Therefore it's an Armstrong number.

*/
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = sc.nextInt();

		int sum=0;
		int r=0;
		int temp=num1;
		
		while(num1!=0) {
			
			r= num1%10;
			sum=sum+r*r*r;
			num1=num1/10;
		}
		
		if(temp==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
	}

}
