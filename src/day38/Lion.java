package day38;

public class Lion extends Animal {
	// Why do we need to ever extend another class?
	// Reusability 
	
	// Inheritance - process where one class get inherit
	// properties and method from another class. 
	// Parent child connection (super class and sub/base class)
	
	// Only visible(access modifiers) properties will get inherited
	
	// we can override parent/super class method in the child class
	@Override
	public void eat() {
		System.out.println("Lion is eating");
	}
	
	@Override
	public void run() {
		System.out.println("Lion is running");
	}
	
	// Break till 8:23 PM EST
}
