package br.com.smelo.school;

import java.util.List;

public class TestingCourse {

	public static void main(String[] args) {
		
		Course javaCollections = new Course("Java Collections", "Paulo Silveira");
		List<Lesson> lessons = javaCollections.getLessons();
		
		javaCollections.append(new Lesson("Learning ArrayList", 25));
		javaCollections.append(new Lesson("Rocking with Collections", 35));
		javaCollections.append(new Lesson("Amazing Lists", 10));

		
		System.out.println(lessons);
	}

}
