package day39;

public class Tesla extends Car {
	@Override
	public void drive() {
		System.out.println("Tesla is driving slow");
	}
	
	@Override
	public void stop() {
		System.out.println("Tesla is not stopping");
	}
	
	@Override
	public double getSpeed() {
		return speed + 4;
	}
}
