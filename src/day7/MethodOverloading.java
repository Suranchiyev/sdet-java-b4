package day7;

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("hello");
		System.out.println(5);
		
		int result = sum(8, 9, 5);
		sum(5.5, 6.9);
		
		printInfo("Vijay", 40);
		printInfo(40, "Vijay");
			
		// Overloading when in the same class we have methods with same name but
		// 1. Different number of arguments
		// 2. Different data type
		// 3. Order of arguments
		// Return type can be anything
	}
	
	public static void printInfo(String name, int age) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static void printInfo(int age, String name) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static double sum(double d, double d2) {
		System.out.println("method 3");
		return d + d2;
	}
	
	public static int sum(int i, int i2) {
		System.out.println("method 1");
		return i + i2;
	}
	
	public static int sum(int i, int i2, int i3) {
		System.out.println("method 2");
		return i + i2 + i3;
	}
}
