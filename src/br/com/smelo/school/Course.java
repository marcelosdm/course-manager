package br.com.smelo.school;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Course {
	private String name;
	private String instructor;
	private List<Lesson> lessons = new LinkedList<Lesson>();
	private Set<Student> students = new HashSet<>();
	private Map<Integer, Student> registerForStudent = new HashMap<>(); 
	
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
	
	public void register(Student student) {
		this.students.add(student);
		this.registerForStudent.put(student.getRegistry(), student);
	}
	
	public Set<Student> getStudents() {
		return Collections.unmodifiableSet(students);
	}
	
	public boolean isRegistered(Student student) {
		return this.students.contains(student);
	}
	
	public Student findRegistered(int number) {
		return registerForStudent.get(number);
	}
}
