package io.java8;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside runnable");
			}
		});
		
		myThread.run();
		
		Thread myLambdaThread = new Thread( ()-> {
			System.out.println("Printed inside Lambda Runnnable");
		});
		
		myLambdaThread.run();
	}
}

// Functional Interface should have only one abstract method, it may have zero or more implemented method inside the interface
