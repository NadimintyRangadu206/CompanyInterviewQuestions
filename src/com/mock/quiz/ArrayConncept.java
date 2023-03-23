package com.mock.quiz;

import java.util.Arrays;

public class ArrayConncept {

	public static void main(String[] args) {
		
		String [] arr=new String[] {"Mac","Linux", "Aindows"};
		Arrays.sort(arr);
	
		System.out.println(Arrays.binarySearch(arr,"Mac"));
		System.out.println(Arrays.toString(arr));
		
		
	}

}
