package io.java8;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Puja", "Pal", 23),
				new Person("Sushovan", "Karmakar", 23),
				new Person("Dona", "Pal", 30),
				new Person("Arpan", "Ghosh", 21),
				new Person("Vikas", "Guha", 20)
				);
		//external iterators : we are managing the iteration process
		System.out.println("Using for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Using foreach loop");
		for (Person p :  people) {
			System.out.println(p);
		}
		
		//internal iterators : control goes to the runtime, it helps in multicore process and parallelism
		System.out.println("Using inbuild foreach loop of collection");
		people.forEach(p -> System.out.println(p));
		
		System.out.println("Using inbuild foreach loop of collection and method reference");
		people.forEach(System.out::println);
	}
}
