package day36;

// What is Encapsulation in Java?
// It's data hiding mechanism by making instance properties private
// and providing public getters and setters methods

// 1. Make all public properties private
// 2. Provide public getters and setters methods
public class Dog {
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
		if (age < 0) {
			System.out.println("Invalid age");
			return;
		}
		
		this.age = age;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		
		if (age < 0) {
			System.out.println("Invalid age");
			return;
		}
		
		this.age = age;
	}
	
	public Dog() {
		
	}
}
