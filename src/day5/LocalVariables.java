package day5;

public class LocalVariables {
	
	public static void main(String[] args) {
		String name = "John Doe";
		String course = "Java";
		int age = 19;
		double grade = 90.0;
		
		// Local variables are variables declared inside methods
		// different statements(conditional, loops)
		
		// These variables are available within the declaration scope
		// they cannot have access modifiers
		// they cannot be static
		
		if (5 > 4) {
			int num = 9;
			System.out.println(num);
		}	
	}
}
