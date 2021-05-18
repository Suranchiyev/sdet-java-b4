package day11;

public class HouseDemo {
	public static void main(String[] args) {
		House houseOne = new House("single family", "101 Main st", 4);
		System.out.println(houseOne); // day11.House@7ad041f3
		
		House houseTwo = houseOne;
		System.out.println(houseTwo);
		
		
		System.out.println(houseTwo.type); // single family
		System.out.println(houseOne.type); // single family
		
		houseTwo.numberOfBedrooms = 5;
		System.out.println(houseOne.numberOfBedrooms); // 5
		System.out.println(houseTwo.numberOfBedrooms); // 5

		
		// == for objects/references it will check if they are pointing to the 
		// same object or not.
		
		System.out.println(houseOne == houseTwo); // true
		
		House houseThree = new House("single family", "101 Main st", 5);
		System.out.println(houseOne == houseThree); // false
	
		System.out.println("=============");
		// GC - Garbage Collector
		// Garbage Collector is a feature of Java that cleans up unused Objects
		// Can you call Garbage Collector? No, we only suggest but it will not guaranty it will clean up
		
		House house4 = new House();
		House house5 = new House();
		
		house5 = house4;
		
		System.out.println("=============");
		
		// only objects can have null value
		House house6 = null;
		// System.out.println(house6.type); NullPointerException
	}
}
