package day39;

public class CarDemo {
	public static void main(String[] args) {
		// Car car = new Car(); // does not compile
		// Abstract class cannot be initialized directly
		
		// Test drive software
		
		// Audi car = new Audi();
		// BMW car = new BMW();
		
		Tesla car = new Tesla();
		
		car.drive();
		System.out.println("---");
		
		car.stop();
		System.out.println("---");
		
		for (int i = 0; i < 5; i++) {
			car.drive();
		}
		
		System.out.println(car.getSpeed());
		car.stop();
		// more code for test drive...
	}
}
