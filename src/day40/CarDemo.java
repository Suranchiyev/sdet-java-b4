package day40;

public class CarDemo {
	public static void main(String[] args) {
		// We cannot create object out of abstract classes
		// Car car = new Car();
		
		// we use abstract classes by having concrete classes
		
		// concrete class is first non abstract class
		// that extends abstract class and implements
		// all its abstract methods.
		
		// How do we implement abstract methods?
		// By Overriding them
		
		// Abstraction will focus on what object does 
		// instead of how it does.
		
		Tesla car = new Tesla();
		// Abstract class can have regular method 
		// and properties
		
		car.drive();
		car.turnLeft();
		car.turnRight();
	}
}
