package day40;

public class Tesla extends Car {
	
	@Override
	public void drive() {
		System.out.println("Tesla is driving");
	}
	
	@Override
	public void stop() {
		System.out.println("Tesla is stopped");
	}
	
	@Override
	public double getSpeed() {
		return speed;
	}
}
