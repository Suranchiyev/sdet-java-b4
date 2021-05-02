package day2;

public class Person {
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		int age = 35;
		
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);
		
		age = age + 10;
		
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);
	}
}
