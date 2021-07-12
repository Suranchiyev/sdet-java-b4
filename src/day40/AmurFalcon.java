package day40;

public class AmurFalcon extends Falcon {
	// First concrete class should implement 
	// all abstract methods
	
	@Override
	public void fly() {
		System.out.println("Amur is flying");
	}
	
	@Override
	public void hunt() {
		System.out.println("Amur is hunting");
	}
}
