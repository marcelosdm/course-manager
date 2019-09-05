package br.com.smelo.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestingListsLesson {

	public static void main(String[] args) {
	
		Lesson l1 = new Lesson("ArrayList Revisited", 25);
		Lesson l2 = new Lesson("Object Lists", 20);
		Lesson l3 = new Lesson("List and object relationship", 15);
		
		ArrayList<Lesson> lessons = new ArrayList<>();
		
		lessons.add(l1);
		lessons.add(l2);
		lessons.add(l3);
		
		System.out.println(lessons);
		
		Collections.sort(lessons);
		System.out.println(lessons);
		
		lessons.sort(Comparator.comparing(Lesson::getTime));
		System.out.println(lessons);
	}

}
