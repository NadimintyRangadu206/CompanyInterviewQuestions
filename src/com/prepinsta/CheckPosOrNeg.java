package com.prepinsta;

import java.util.Scanner;

public class CheckPosOrNeg {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");

		int no = sc.nextInt();

		if (no >= 0) { // one Way Of doing
			if (no == 0) {
				System.out.println("Zero");
			} else {
				System.out.println("Positive");
			}
		} else {
			System.out.println("Negative");
		}

		System.out.println(); // another way Of doing

		if (no == 0) {
			System.out.println("Zero");
		} else {
			String v = no >= 0 ? "Positive" : "Negative"; // using ternary Operator
			System.out.println(v);
		}
		
		
		System.out.println();
		
		boolean flag = false;
		
		if(no==0) {
			System.out.println("Zero");
		}else
		{
			 flag=no>=0?true:false;
		}
		
		if(flag==true) {
			System.out.println("Positive");
		}else {
			System.out.println("Negative");
		}
	
	}

}
