package day38;

public class Student {
	public String name;
	public long studentId;
	
	// What is a constructor in Java?
	// It's a special method to create an object
	
	// Constructor will get invoked when we create
	// an object from the class. By default java
	// will provide empty constructor
	
	public Student(String name, long studentId) {
		System.out.println("inside args constructor");
		this.name = name;
		this.studentId = studentId;
	}
	
	// Constructor call should be in the first statement
	public Student() {
		this("Kuba", 0);
		System.out.println("Inside empty constructor");
	}
}
