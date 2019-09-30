package io.java8;

public class Greeter {
	
	public void greet(Greeting greeting) {
		//System.out.println("Hello World!");
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		//greeter.greet();
		
		 Greeting helloWorldGreeting = new HelloWorldGreeting();
		 Greeting lamdaGreeting = () -> System.out.println("Hello Greeting Lamda");
		 
		 
		 Greeting innerAnnonymousClassGreeting = new Greeting() {
			 public void perform() {
				 System.out.println("Hello World!");
			 }
		 };
		 
		 helloWorldGreeting.perform();
		 lamdaGreeting.perform();
		 innerAnnonymousClassGreeting.perform();
		 
		 
		 greeter.greet(helloWorldGreeting);
		 greeter.greet(lamdaGreeting);
		 greeter.greet(innerAnnonymousClassGreeting);
		 greeter.greet(() -> System.out.println("Hello Inline Greeting Lamda"));
		 
		 
		 MyLambda myLamdaFunction = () -> System.out.println("Hello Lamda");
		 MyAdd addFunction = (int a, int b) -> a+b;
	}
}

interface MyLambda {
	void foo();
}

interface MyAdd {
	int add(int a, int b);
}
