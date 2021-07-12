package day41.inheritance;

public class Student extends Person {
	
	@Override
	public void work() {
		super.work();
		System.out.println("and studying and the same time");
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.firstName = "John";
		obj.lastName = "Doe";
		obj.age = 27;
		obj.address = "101 Main st";
		
		obj.work();
		obj.walk();
		
		// Method Overriding
		// super will refer to parent class
	}
}