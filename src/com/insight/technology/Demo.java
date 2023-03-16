package com.insight.technology;

import java.text.NumberFormat;
import java.util.Locale;

public class Demo {

	public static void main(String[] args) {

		try {

			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println("try");

		} catch (Exception e) {
			
			System.out.println("Catch");
		} finally {
			System.out.println("Final");
		}
		
		
		
		
		double d=1233.00;
		
	
		String str=NumberFormat.getCurrencyInstance(Locale.CANADA).format(d);
		System.out.println(str);

	}

}
