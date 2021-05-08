package day3;

public class Var {
	public static void main(String[] args) {
		// declare a variable with firstName
		String firstName;
		
		// assign value as "John"
		firstName = "John";
		
		// read value
		System.out.println(firstName); // John
		
		// reassign the value 
		firstName = "Smith";
		System.out.println(firstName); // Smith
		
		// declare a variable of type String with value "Doe"
		String lastName = "Doe";
		System.out.println(lastName); // Doe
		
		System.out.println(firstName); // Smith
		System.out.println(lastName); // Doe
		
		firstName = "Alex";
		lastName = "Rodriguez";
		
		System.out.println(firstName); // Alex
		System.out.println(lastName); // Rodriguez
		
		// Variable declaration
		// Type name
		String address, state, country;
		
		address = "101 Main st";
		state = "VA";
		country = "USA";
		
		System.out.println(address);
		System.out.println(state);
		System.out.println(country);
		
		// System.out.println(str);
		// str = "kiwi";
		String str = "apple";
		System.out.println(str);
		
	}
}
