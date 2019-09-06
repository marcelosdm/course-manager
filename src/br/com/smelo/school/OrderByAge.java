package br.com.smelo.school;

import java.util.Comparator;

public class OrderByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee employee, Employee anotherEmployee) {
		return  employee.getAge() - anotherEmployee.getAge();
	}

}
