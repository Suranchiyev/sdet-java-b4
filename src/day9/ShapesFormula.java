package day9;

public class ShapesFormula {
	// - constants they go with upper case
	// - value of final variables cannot be changed
	
	public static final double PI = 3.14;
	public static final String ERROR_MSG =  "Error in the program";
	
	/**
	 * Circumference of a circle
	 * 2 * PI * radius
	 */
	public static double getCOfCircle(int radius) {
		return 2 * PI * radius;
	}
	
	/**
	 * Area of a circle
	 * PI * radius ^ 2
	 */
	public static double getAreaOfCircle(int radius) {
		return PI * (radius * radius);
	}
	
	/**
	 * Surface area of a sphere
	 * 4 * PI * radius ^ 2
	 */
	public static double getSAreaOfSphere(int radius) {
		return 4 * PI * (radius * radius);
	}
	
	public static void main(String[] args) {
		System.out.println("Circumference: " + getCOfCircle(5));
		System.out.println("Area: " + getAreaOfCircle(5));
		System.out.println("Surface area: " + getSAreaOfSphere(5));
	}
}
