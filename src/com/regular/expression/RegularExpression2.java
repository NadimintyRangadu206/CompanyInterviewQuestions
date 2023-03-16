package com.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression2 {

	public static void main(String[] args) {

		String str = "dfjj23232bnfbdr7y.3XFDFSK.DK SJ@#@^@#(.@#(@CGkjfkdjd";

		Pattern p = Pattern.compile("(\\d)(\\D)(\\w)");
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.print(m.group(2));
		}

	}

}
