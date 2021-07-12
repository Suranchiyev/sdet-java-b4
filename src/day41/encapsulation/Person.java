package day41.encapsulation;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		// firstName = null;
		// firstName.isEmpty() -> NullPointerException
		if (firstName == null || firstName.isEmpty()) {
			System.out.println("Invalid input");
			return; // to exit from the method
		}
		
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 1) {
			System.out.println("Invalid input");
			return;
		}
		
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
