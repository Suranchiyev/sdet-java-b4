package day15;

public class Student {
	public String name;
	public int age;
	
	// BREAK TILL 2:27 PM EST
	
	public Student(String name) {
		System.out.println("1 arg constructor");
		this.name = name;
	}
	
	public Student(String name, int age) {
		System.out.println("2 args construtor");
		this.name = name;
		this.age = age;
	}
}
