package com.prepinsta;

import java.util.Scanner;


public class CheckLeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year");
		int year = sc.nextInt();
		
		if(year%400==0) {                                   // Method-1
			System.out.println("Leap Year");
		}
		else if(year%4==0 && year%100!=0) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");
		}
		
		if(year%400==0 || (year%4==0 && year%100!=0)) {           // Method-2
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap year");
		}
		
		 
		int flag;	                                                //Method-3
		flag=(year%400==0) ||(year%4==0 && year%100!=0)?1:0;   // Ternary Operator
		
		if(flag==1) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");
		}
		
		
		boolean leap;                                       // Method-4
		
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			leap=true;
		}else {
			leap=false;
		}
		
		if(leap==true) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");
		}

	}

}
