package day36;

public class Superhero {
	public String name;
	public int powerLevel;
	
	// Constructor is special method to create an object
	// constructor name is same name as class name
	public Superhero() {
		System.out.println("in the empty constructor");
	}
	
	public Superhero(String name, int powerLevel) {
		System.out.println("2 arg constructor");
		this.name = name;
		this.powerLevel = powerLevel;
	}
	
	public Superhero(String name) {
		System.out.println("1 arg name constructor");
		this.name = name;
	}
	
	public Superhero(int powerLevel) {
		System.out.println("1 arg powerLevel constructor");
		this.powerLevel = powerLevel;
	}
}
