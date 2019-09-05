package br.com.smelo.school;

import java.util.ArrayList;
import java.util.Collections;

public class TestingLists {

	public static void main(String[] args) {
	
		String course1 = "Maven";
		String course2 = "MongoDB";
		String course3 = "Java Web";
		
		ArrayList<String> courses = new ArrayList<String>();
		
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		System.out.println(courses);

		Collections.sort(courses);
		System.out.println(courses);
		
	}

}
