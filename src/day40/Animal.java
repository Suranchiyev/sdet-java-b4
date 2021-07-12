package day40;

public abstract class Animal {
	public String name;
	
	public String getName() {
		return name;
	}
	
	public abstract void eat();
	public abstract void sleep();
}
