package br.com.smelo.school;

public class TestingRegisterStudents {

	public static void main(String[] args) {

		Course javaCollections = new Course("Java Collections", "Paulo Silveira");
		
		Student s1 = new Student("Marcelo", 1);
		Student s2 = new Student("Kaique", 2);
		Student s3 = new Student("Pedro", 3);
		
		javaCollections.register(s1);
		javaCollections.register(s2);
		javaCollections.register(s3);
		
//		javaCollections.getStudents().forEach(student -> System.out.println(student));
		
		Student student = javaCollections.findRegistered(1);
		System.out.println(student);
	}

}
