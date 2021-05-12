package day8;

public class Review2 {

	public static void main(String[] args) {
		// Block of code 
		// void methods   - does not return anything
		// return methods - does return some value
		
		System.out.println(isEvenNumber(7));
		System.out.println(isEvenNumber(8));
		
		sum(5, 6);
		sum(1999, 299);
		sum(9,7);		
	}
	
	public static void sum(int number1, int number2) {
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
	}
	
	public static boolean isEvenNumber(int i) {
		// boolean - return type of method. Method will return boolean
		// (int i) - argument - the way method accepts the data
		
//		if (i % 2 == 0) {
//		    return true;
//	    } else {
//		    return false;
//	    }
		return i % 2 == 0;
	}
}
