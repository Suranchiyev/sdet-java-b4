package day36;

public class Person {
	public String firstName;
	public String lastName;
	
	public static int age;
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
}
