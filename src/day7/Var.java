package day7;

public class Var {
	public static void main(String[] args) {
		int num = 10;
				
		if (5 > 3) {
			// we can use num here
			System.out.println(num);
			
			int num2 = 9;
			System.out.println(num2);
		} else {
			// It does not compile. It's not visible outside of scopes
			// System.out.println(num2);
		}
		
		// It does not compile. It's not visible outside
		// System.out.println(num2);
	}
}
