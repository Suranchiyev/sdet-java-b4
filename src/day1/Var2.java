package day1;

public class Var2 {
	public static void main(String[] args) {
		String firstName = "Kuba";
		String lastName = "Zhanbaev";
		
		// concatenation
		System.out.println("First name: " + firstName); // First name: Kuba
		System.out.println("Last name: " + lastName); // Last name: Zhanbaev
		System.out.println(firstName + " " + lastName); // Kuba Zhanbaev
		
		//              =        "Kuba Zhanbaev"
		String fullName = firstName + " " + lastName;
		
		System.out.println("Full name: " + fullName); // Full name: Kuba Zhanbaev
		System.out.println(fullName); // Kuba Zhanbaev
		
		fullName = "John Doe";
		System.out.println(fullName); // John Doe
		// BREAK TILL 2:10 PM EST
	}
}
