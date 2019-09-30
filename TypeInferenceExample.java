package io.java8;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLengthLambda myLambda = s -> s.length();
		System.out.println(myLambda.getStringLength("Sushovan"));
		
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getStringLength("Hello Lambda"));
	}
	
	interface StringLengthLambda {
		int getStringLength(String s);
	}
}
