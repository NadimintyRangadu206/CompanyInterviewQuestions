package com.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExamples {

	public static void main(String[] args) {
		
		Pattern p= Pattern.compile("a",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher("zzzdhgzgdwabmsaAADD");
		
		while (m.find()) {
			System.out.println(m.start()+"-"+m.group()+"-"+m.end());
		}

	}

}
