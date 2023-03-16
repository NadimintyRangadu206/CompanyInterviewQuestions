package com.insight.technology;

import java.util.ArrayList;
import java.util.List;

public class CollectionTopic {

	public static void main(String[] args) {

		List<Student> st=new ArrayList<Student>();

		st.add(new Student(1,"John",50));
		st.add(new Student(2,"Toy",80));
		st.add(new Student(3,"Jocky",30));

		for (int i = 0; i < st.size(); i++) {

			System.out.println(st.get(i));
		}
		System.out.println();

		System.out.println("Highest Total Marks of Student:");
		
		for (Student s : st) {
			
			if(s.getTotalMarks()>30 && s.getTotalMarks()>50 && s.getTotalMarks()<=100) {
				System.out.println(s);
			}
		}


	}

}
