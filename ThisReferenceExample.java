package io.java8;

public class ThisReferenceExample {

	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(15, new Process() {
			
			// in an anonymous inner class, when using the this reference, anonymous inner class instance overrides that this reference
			
			@Override
			public void process(int i) {
				System.out.println("Value of i is " + i);
				System.out.println(this);
			}
			
			@Override
			public String toString() {
				return "This is the anonymous inner class";
			}
		});
		
		thisReferenceExample.doProcess(5, i -> {
				System.out.println("Value of i is " + i);
				//System.out.println(this);   // this line won't work
		});
		
		
		thisReferenceExample.execute();
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			System.out.println(this);
		});
	}
	
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	@Override
	public String toString() {
		return "This is the main ThisReferenceExample class instance";
	}
}
