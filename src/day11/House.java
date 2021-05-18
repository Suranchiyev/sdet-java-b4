package day11;

public class House {
	public String type;
	public String address;
	public int numberOfBedrooms;
	
	// if we don't have any constructor, java will provide default empty constructor
	public House() {
		
	}
	
	public House(String type, String address, int numberOfBedrooms) {
		this.type = type;
		this.address = address;
		this.numberOfBedrooms = numberOfBedrooms;
		// 'this' referring to this current object.
	}
	
	// What's constructor in Java?
	// It's special method with same name of the class. 
	// We use it to create an object of the class
}
