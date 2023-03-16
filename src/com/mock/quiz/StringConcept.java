package com.mock.quiz;

public class StringConcept {

	public static void main(String[] args) {

		String s3="Java";
		String s4="Java";
		StringBuilder sb=new StringBuilder();
		sb.append("Ja").append("va");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(sb.toString()==s3);
		System.out.println(sb.toString().equals(s4));
		System.out.println("*****");
		
		String s1="hello";
		String s2=new String("hello");
		s2=s2.intern();
		System.out.println(s1==s2);
		
		
		StringBuffer sf= new StringBuffer(s1);
		System.out.println(sf.equals(s1));
		String str = null;

		System.out.println(str);
		System.out.println(str.toString());
		switch (str) {
		case "null":
			System.out.println("Null String");// suppose we declare variable has a null.and perform any operation on the
												// variable that time NullPointer exception is thrown.
			break;
		}
		
	

	}

}
