package com.regular.expression;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class RegularSplit {

	public static void main(String[] args) {
		
		
		String str="one@two#three:four$five";
		Pattern p=Pattern.compile("\\W");

		String [] arr=p.split(str);
		
		for (String s : arr) {
			System.out.println(s);
		}
		
		System.out.println();
		String st=new String("one@two#three:four$five");
		
		String aa1[]=st.split("\\W");
		
		for (String s : arr) {
			System.out.println(s);
		}
		
		System.out.println();
		StringTokenizer stz=new StringTokenizer(st,"@#:$");
		
		while(stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());
		}
	}

}
