package io.java8;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Puja", "Pal", 23),
				new Person("Sushovan", "Karmakar", 23),
				new Person("Dona", "Pal", 30),
				new Person("Arpan", "Ghosh", 21),
				new Person("Vikas", "Guha", 20)
				);
		
		// Lambda expression enables parallel processing
		
		
		people.stream()   // source of the stream
		.filter(p -> p.getLastName().startsWith("P"))   // operation has to perform on the stream
		.forEach(p -> System.out.println(p.getFirstName()));   // terminal operation
		
		long count = people.stream()
				.filter(p -> p.getLastName().startsWith("G"))
				.count();
		System.out.println("count " + count);
		
		long count1 = people.parallelStream()
				.filter(p -> p.getLastName().startsWith("K"))
				.count();
		System.out.println("count " + count1);
		
	}
}
