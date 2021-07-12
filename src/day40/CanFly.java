package day40;

public interface CanFly {
	public abstract void fly();
	
	public abstract void takeoff();
	
	public abstract void dive();
	
	// default and static methods are not abstract
	// they can have bodies
	public default String getHello() {
		return "Hello";
	}
	
	public static void printHello() {
		System.out.println("hello");
	}
}
