package com.hacke.rank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormattedPayment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a payment:");

		Double payment = sc.nextDouble();

		String English = NumberFormat.getCurrencyInstance(Locale.ITALY).format(payment);
		System.out.println(English);

		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		System.out.println(us);

		Locale e;
		String India = NumberFormat.getCurrencyInstance(new Locale("India")).format(payment);
		System.out.println(India);
		
		
		String japan=NumberFormat.getCurrencyInstance(Locale.JAPAN).format(payment);

	}

}
