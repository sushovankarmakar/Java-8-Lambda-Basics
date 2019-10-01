package io.java8;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		Thread thread = new Thread( ()-> printMessage());
		thread.run();
		
		
		/*
		 * when we have a lambda expression, which takes no input arguments and calling
		 * a method without any arguments, then we can replace the lambda expression
		 * with method reference
		 */
		
		// MethodReferenceExample1::printMessage ===  ()-> printMessage()
		
		Thread thread1 = new Thread(MethodReferenceExample1::printMessage);
		thread1.run();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}
}
