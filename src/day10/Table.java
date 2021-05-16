package day10;

public class Table {
	public String color;
	public String type;
	public boolean isReserved;

	public void displayDetails() {
		System.out.println("Color: " + color);
		System.out.println("Type: " + type);
		System.out.println("Is reserved: " + isReserved);
	}
	
	// constructor is special method to create an object
	public Table(String color, String type, boolean isReserved) {
		System.out.println("Constructor with 3 args");
		this.color = color;
		this.type = type;
		this.isReserved = isReserved;
	}
	
	public Table() {
		System.out.println("Empty constructor");
	}
}
