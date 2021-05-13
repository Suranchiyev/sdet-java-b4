package officehours1;

public class ConditionalBranching {
	public static void main(String[] args) {		
		// true or false
		boolean b = true;
		
		// Comparison operators
		// == to compare primitives on equality
		//    when comparing references it will 
		//    check if they are pointing to the same
		//    object or not.		
		int i = 9;
		int i2 = 9;
		boolean b2 = i == i2;
		
		char ch = 'a';
		char ch2 = 'a';
		b2 = ch == ch2;
		// >, <, >=, <=
		
		// logical operators
		int number = 14;
		// if number is 8 or 12 print Yes
		
		if (number == 8 || number == 12) {
			System.out.println("Yes");
		}
		
		// if number from 10 to 20 inclusive print Yes
		if (number >= 10 && number <= 20) {
			System.out.println("Yes");
		}
		
		// false || true || false -> true
		// false && true && false -> false
		// true  && true && true  -> true
		
		
		number = 101;
		// ! - Not		               
		if (!(number > 100)) {
			System.out.println("Yes yes yes");
		}
		
		boolean b3 = !false;
		System.out.println(b3); // true
		
		int j = 8;
		int j2 = 12;
		
		// != Not equal
		if (j != j2) {
			System.out.println("Java");
		}
	}
}
