package io.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolution8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Puja", "Pal", 23),
				new Person("Sushovan", "Karmakar", 23),
				new Person("Dona", "Pal", 30),
				new Person("Arpan", "Ghosh", 21),
				new Person("Vikas", "Guha", 20)
				);
		
		// Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()) );
		
		
		// Create a method that prints all elements in the list
		printConditionally(people, p-> true);
		
		System.out.println("------------------------");
		// Create a method that prints all people that have last name beginning with P
		printLastNameBeginningWithC(people);
		
		
		System.out.println("------------------------");
		// Create a method that prints all people that have last name beginning with G
		printConditionally(people, p -> p.getLastName().startsWith("G"));
		
		
		System.out.println("------------------------");
		// Create a method that prints all people that have first name beginning with S
		printConditionally(people, p -> p.getFirstName().startsWith("S"));

	}

	private static void printLastNameBeginningWithC(List<Person> people) {
		for(Person p: people) {
			if(p.getLastName().startsWith("P"))
				System.out.println(p);
		}
	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p: people) {
			if(condition.test(p))
				System.out.println(p);
		}
	}
}


