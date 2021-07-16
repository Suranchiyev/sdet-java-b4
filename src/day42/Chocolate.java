package day42;

public class Chocolate {
	public static String str;
	public String str1;
	public String str2;
	
	public Chocolate() {
		System.out.println("In the constructor");
	}
	
	public Chocolate(String str1, String str2) {
		System.out.println("In the 2 args constructor");
		this.str1 = str1;
		this.str2 = str2;
	}
	
	{
		// initializer block
		System.out.println("In the initializer block");
		str1 = "Raffaello";
		str2 = "La Maison";
			
		// why do we need this?
		// To initialize the properties and prep the object
	}
	
	static {
		// static block
		System.out.println("In the static block");
		
		// Non static members cannot be called inside static members
		// str1 = "Mars";
		
		str = "Mars";
		
		// To initialize static properties.
	}
	
	
}
