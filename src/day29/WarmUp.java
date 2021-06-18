package day29;

public class WarmUp {
	public static void main(String[] args) {
		printNewLine(5);
		
		printNewLine(5, 7);
		
		printNewLine(5, 7, 8);
	}
	
	public static void printNewLine(int ... num) {
		for (int i : num) {
			System.out.println(i);
		}
	}
	
	// How many varargs arguments per method we can have?
	// Only one vararg argument per method.
	
	// Varargs can be used with other arguments(none vararg) if it's last argument.
	
	public static void testMethod(String str, int[] num, int ... nums) {
		
	}
}
