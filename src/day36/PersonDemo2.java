package day36;

public class PersonDemo2 {
	// Static variables and methods belong to the class
	// not to specific object
	
	// We should always access static variables
	// and method by class name
	
	// Break till 8:34 PM EST
	
	public static void main(String[] args) {
		Person obj1 = new Person();
		obj1.firstName = "John";
		obj1.lastName = "Doe";
		
		Person.age = 25;
		
		System.out.println(obj1.getFullName());
		System.out.println("Age: " + Person.age);
		
		Person obj2 = new Person();
		System.out.println(obj2.getFullName());
		System.out.println("Age: " + Person.age);
		
		Person obj3 = new Person();
		System.out.println(Person.age); // 25
	}
}
