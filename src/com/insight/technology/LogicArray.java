package com.insight.technology;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author nadim
 * 
 * Given one Array that is character array.In this array having both vowels and consonants.
 * print only consonants 
 * 
 * Condition: if you  Not Use if statement
 *
 */
public class LogicArray {

	public static void main(String[] args) {

// one way Of approach;	
		
		char ch[] = { 'a', 'b', 'i', 'u', 'A', 'o', 'E', 'Z', 'O' };

	
//	String str = new String();
		
		for (int i = 0; i < ch.length; i++) {

			Character ch1 = (ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U'
					&& ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') ? ch[i] : '-';
			System.out.println(ch1);
		}

		
// another way of approach;	
		
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < ch.length; i++) {

			list.add(ch[i]);
		}

		System.out.println(list);

		List<Character> arr = new ArrayList<Character>();
		
		arr = list.stream().filter(i -> i != 'A' && i != 'E' && i != 'I' && i != 'O' && i != 'U' && i != 'a' && i != 'e'
				&& i != 'i' && i != 'o' && i != 'u').collect(Collectors.toList());

 	System.out.println(arr);
		
		for (Character cha : arr) {
			
			System.out.print(cha+" ");
		}
	}

}
