package day44;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age <= 0) {
			// by using throw keyword we can throw our own exceptions
			throw new IllegalArgumentException("Invalid age: " + age);
			// throw new RuntimeException("Invalid age: " + age); 
			//throw new Exception("Invalid age: " + age);
		} 
		
		this.age = age;
	}
}
