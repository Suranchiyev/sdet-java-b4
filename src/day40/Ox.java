package day40;

public class Ox extends Mammal {
	
	@Override
	public void eat() {
		System.out.println("Ox is eating");
	}
	
	@Override
	public void sleep() {
		System.out.println("Ox is sleeping");
	}
	
	@Override
	public void drinkMilk() {
		System.out.println("Ox is drinking milk");
	}
}
