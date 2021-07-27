package day49;

public class Person {
	public String name;
	public int age;
	
	public static String address;
	
	public static void main(String[] args) {
		Person john = new Person();
		john.name = "John";
		john.age = 35;
		john.address = "101 Main St";
		
		System.out.println(john.name); // John
		System.out.println(john.age); // 35
		System.out.println(john.address); // 101 Main St
		
		Person smith = new Person();
		System.out.println("---------");
		System.out.println(smith.name); // null
		System.out.println(smith.age); // 0
		System.out.println(smith.address); // 101 Main St
		
		smith.address = "55 North St";
		
		System.out.println("---------");
		Person alex = new Person();
		System.out.println(alex.address); // 55 North St
		
		// What's static keyword in Java?
		// - Static methods and variables belong to class, not to specific object.
		// - The correct way of using static methods and variables is by class name.
		System.out.println(Person.address);
		Person.address = "15 South St";
	}
}
