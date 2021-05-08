package day6;

public class MethodExample {
	public static void main(String[] args) {		
		// Method is a block of code that can be executed when call it. 
		// we call/invoke methods by their name
		
		printHello();
		System.out.println("---");
		
		// more code ...
		
		printHello();
		System.out.println("---");
		// a lot more code ...
		
		printHello();
		System.out.println("---");
	}
	
	public static void printHello() {
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
	}	
}
