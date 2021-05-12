package day8;

public class Review {
	public static void main(String[] args) {
		boolean b = 5 < 3;				
		if (b) {
			System.out.println("It was true");
		} else {
			System.out.println("It was false");
		}
		
		// How do we compare primitives on equality?
		// - to compare primitives we can use == operator. 
		// - for objects it will compare if two references are pointing 
		// to the same object or not.
		
		int i = 7;
		int i2 = 8;
		System.out.println(i == i2);
		
		i = 5;
		i2 = 5;
		// greater or equal
		if (i >= i2) {
			System.out.println("Yes");
		}
		
		i = 17;
		i2 = 17;
		System.out.println("not equal: " + (i != i2));
		System.out.println("equal: " + (i == i2));
		
		int number = 7;
		
		// if number is 5 or 7 print Java otherwise print Python
		// || logical OR operator
		//              OR
		if (number == 5 || number == 7) {
			System.out.println("Java");
		} else {
			System.out.println("Python");
		}
		// false || true -> true
		
		// if number is between 3 and 10 print "Java is cool"
		// otherwise print "Python is cool"
		number = 2;
		//   2    f    AND   2   t
		if (number > 3 && number < 10) {
			// true && true -> true
			// false && true -> false
			System.out.println("Java is cool");
		} else {
			System.out.println("Python is cool");
		}

		number = 18;
		// if number is between 2 and 10 or it is 13 or 17 print "Hello"
		// otherwise "Good morning"
		//              f               OR      f      OR     f
		if ((number > 2 && number < 10) || number == 13 || number == 17) {
			System.out.println("Hello");
		} else {
			System.out.println("Good morning");
		}
	}
}
