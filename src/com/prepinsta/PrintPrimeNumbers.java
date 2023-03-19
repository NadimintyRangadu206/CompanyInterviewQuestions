package com.prepinsta;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		int no=10; int count=0;
		for(int i=2;i<=no;i++) {	
			for(int j=2;j<=j/i;j++) {
				
				if(no%i==0) {
					System.out.println(j);
				}
			}
		}

	}

}
