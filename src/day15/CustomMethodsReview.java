package day15;

public class CustomMethodsReview {
	public static void main(String[] args) {
		
		myMethod("Alex");
		
		System.out.println("The end");
		
	    myMethod("Kuba");
		// -----
		
		String abc = "John Doe";
		int someAge = 39;
		String address = "101 Main st";
		
		myMethod(abc, someAge, address);
		
		System.out.println("-------");
		
		myMethod("Will Smith", 40, "312 North st");
		
		String str = getMsg("Bek");
		System.out.println(str);
	}
	
	public static void myMethod(String name) {
		System.out.println("Hello, " + name);
	}
	
	public static void myMethod(String name, int age, String address) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
	}
	
	// whatever we mention as return type, method should return 
	// that type of data
	public static String getMsg(String name) {
		return name + ", hello!";
	}
}
