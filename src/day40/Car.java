package day40;

public abstract class Car {
	public double speed;
	
	// Abstract methods don't have a bodies
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract double getSpeed();
	
	public void turnLeft() {
		System.out.println("Left turn");
	}
	
	public void turnRight() {
		System.out.println("Right turn");
	}
}
