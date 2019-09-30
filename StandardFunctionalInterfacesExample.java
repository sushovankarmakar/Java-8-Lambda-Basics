package io.java8;

import java.io.Console;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {

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
		performConditionally(people, p-> true, p-> System.out.println(p));
		
		System.out.println("------------------------");
		// Create a method that prints all people that have last name beginning with P
		printLastNameBeginningWithC(people);
		
		
		System.out.println("------------------------");
		// Create a method that prints all people that have last name beginning with G
		performConditionally(people, p -> p.getLastName().startsWith("G"), p-> System.out.println(p));
		
		
		System.out.println("------------------------");
		// Create a method that prints all people that have first name beginning with S
		performConditionally(people, p -> p.getFirstName().startsWith("S"), p-> System.out.println(p.getFirstName()));

	}

	private static void printLastNameBeginningWithC(List<Person> people) {
		for(Person p: people) {
			if(p.getLastName().startsWith("P"))
				System.out.println(p);
		}
	}
	
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p: people) {
			if(predicate.test(p))
				consumer.accept(p);
		}
	}
}


