package day7;

public class ConditionalBranching {
	public static void main(String[] args) {
		int number = 5;
		int number2 = 6;
		
		//        6 > 5 => true  
		if (number2 > number) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		//  11 < 9 => false
		if (11 < 9) {
			System.out.println("Yes, yes");
		}
		
		int i = 14;
		int j = 17;
		
		// == to compare primitives on their equality
		boolean isEq = i == j;
		System.out.println(isEq);
		
		// >, <, >=, <=, 
		// == 
		// !=
		if (isEq) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		
		// == compare on equality 
		int n1 = 5;
		int n2 = 5;
		
		boolean isEqual = n1 == n2;
		
		// != not equal
		boolean isNotEqual = n1 != n2;
		// 5 not equal 34 => true
		// 5 not equal 5  => false
		
		// >= greater or equal
		boolean greaterOrEqual = n1 >= n2;
		System.out.println(greaterOrEqual);
		
		// <= less or equal
		boolean lessOrEqual = n1 <= n2;
	}
}
