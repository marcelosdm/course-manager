package br.com.smelo.school;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestingEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee("Marcelo", 33);
		Employee e2 = new Employee("Danilo", 65);
		Employee e3 = new Employee("Levinsky", 18);
		
		Set<Employee> employees = new TreeSet<>(new OrderByAge());
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		Iterator<Employee> iterator = employees.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}

}
