package day10;

public class Main {
	public static void main(String[] args) {
		// Instance and Object
		Person person1 = new Person();		
		person1.firstName = "John";
		person1.lastName = "Doe";
		person1.age = 25;
		// person1.address = "101 Main st";
		
		Person person2 = new Person();
		person2.firstName = "Will";
		person2.lastName = "Smith";
		person2.age = 35;
		
		System.out.println(person1.firstName); // John
		System.out.println(person2.firstName); // Will
		
		person1.firstName = "Bek";
	}
}

class Person {
	public String firstName;
	public String lastName;
	public int age;
}



