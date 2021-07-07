package day38;

public class Mammal {
	public String name;
	
	public Mammal(String name) {
		this.name = name;
	}
	
	public void drinkMilk() {
		System.out.println("Mammal is drinking milk");
	}
	
	@Override
	public boolean equals(Object obj) {
		Mammal m = (Mammal)obj;	
		return m.name.equals(this.name);
	}
	
	@Override
	public String toString() {
		return "Mammal: {name = " + name + "}";
	}
	
	public static void main(String[] args) {	
		// why every object should inherit from the java.lang.Object class?
		// Common way of working with objects
		
		// equals
		// toString
		
		Mammal obj = new Mammal("Tiger");
		Mammal obj2 = new Mammal("Tiger");
		
		// by default .equals will compare with == for custom objects
		// obj == obj2 - if they are pointing to the same object or not
		
		if (obj.equals(obj2)) {
			System.out.println("Yes, equal");
		} else {
			System.out.println("Not");
		}
		
		// How do you compare two custom objects?
		// 1. I can compare manually each property of these two objects
		// 2. I can override equals method and compare two objects
		
		
		Mammal obj3 = new Mammal("Dog");
		// toString should return string representation of the object
		System.out.println(obj3.toString());
		System.out.println(obj3);
	}
}
