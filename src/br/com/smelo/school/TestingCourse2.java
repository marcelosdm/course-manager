package br.com.smelo.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCourse2 {

	public static void main(String[] args) {
		
		Course javaCollections = new Course("Java Collections", "Paulo Silveira");
		List<Lesson> imutableLessons = javaCollections.getLessons();
		
		
		javaCollections.append(new Lesson("Learning ArrayList", 25));
		javaCollections.append(new Lesson("Rocking with Collections", 35));
		javaCollections.append(new Lesson("Amazing Lists", 10));
		
		List<Lesson> lessons = new ArrayList<>(imutableLessons);
		Collections.sort(lessons);

		
		System.out.println(lessons);

	}

}
