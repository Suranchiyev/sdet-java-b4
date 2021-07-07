package day37;

public class Person {
	public String firstName;
	public String lastName;
	public int age;
	
	private String nationality;
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
}
