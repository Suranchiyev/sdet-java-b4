package day38;

public class Car extends Vehicle {
	public Car(String name, double price) {
		super(name, price);	
	}
	
	public static void main(String[] args) {
		Car car = new Car("BMW", 20000.0);
		System.out.println(car.name);
		System.out.println(car.price);
	}
}