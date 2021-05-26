package day15;

public class StudentDemo {
	// 1. if we don't have any constructors
	//    java will provide empty default
	//    constructor
	
	
	public static void main(String[] args) {
		Student s1 = new Student("Bek");
		System.out.println(s1.name); // Bek
		
		Student s2 = new Student("Alex", 35);
		System.out.println(s2.name); // Alex
		System.out.println(s2.age); //  35
	}
}
