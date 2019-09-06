package br.com.smelo.school;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestingPerformance {

	public static void main(String[] args) {

		Collection<Integer> numbers = new HashSet<Integer>();
		
		long init = System.currentTimeMillis();
		
		for (int i = 1; i <= 50000; i++) {
			numbers.add(i);
		}
		
		for (Integer number: numbers) {
			numbers.contains(number);
		}
		
		long end = System.currentTimeMillis();
		
		long timeOfExecution = end - init;
		
		System.out.println("Passed time: " + timeOfExecution);
	}

}
