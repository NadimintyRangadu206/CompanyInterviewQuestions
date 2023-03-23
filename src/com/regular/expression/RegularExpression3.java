package com.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression3 {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("(0?|91)[7-9][0-9]{9,}");
		Matcher m=p.matcher("07555576575");
		while (m.find()) {
			System.out.print(m.group());
		}

	}

}
