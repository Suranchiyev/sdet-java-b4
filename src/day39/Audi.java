package day39;

// if we extends abstract class we must 
// implement its abstract methods.
// implement = override
public class Audi extends Car {
	
	@Override
	public void drive() {
		System.out.println("Audi is driving");
	}
	
	@Override
	public void stop() {
		System.out.println("Audi is stopped");
	}
	
	@Override
	public double getSpeed() {
		return speed;
	}
}
