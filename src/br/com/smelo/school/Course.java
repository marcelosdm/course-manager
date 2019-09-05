package br.com.smelo.school;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Course {
	private String name;
	private String instructor;
	private List<Lesson> lessons = new LinkedList<Lesson>();
	
	public Course(String name, String instructor) {
		super();
		this.name = name;
		this.instructor = instructor;
	}
	
	public String getName() {
		return name;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	public List<Lesson> getLessons() {
		return Collections.unmodifiableList(lessons);
	}
	
	public void append(Lesson lesson) {
		this.lessons.add(lesson);
	}
	
	public int getFullTime() {
		int fullTime = 0;
		
		for (Lesson lesson : lessons) {
			fullTime += lesson.getTime();
		}
		
		return fullTime;
	}
	
	@Override
	public String toString() {
		return "[Course: " + this.name + ", full time: " + this.getFullTime();
	}
	
}
