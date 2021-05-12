package day7;

public class MoreMethods {
	public static void main(String[] args) {
		luckyNumber(4); // Try tomorrow!
		luckyNumber(5); // Try tomorrow!
		luckyNumber(7); // Lucky number!

		bigNum(2000); // 2000 is big number
		bigNum(1000); // 1000 is big number
		bigNum(999); // 999 is regular number
		bigNum(2); // 2 is regular number

		System.out.println(badNum(7)); // regular number
		System.out.println(badNum(13)); // bad number
		System.out.println(badNum(22)); // regular number

		System.out.println(min(3, 9)); // 3
		System.out.println(min(18, 17)); // 17
		System.out.println(min(1, 1)); // 1
		
		System.out.println(isEvenNumber(4)); // true
		System.out.println(isEvenNumber(7)); // false
		System.out.println(isEvenNumber(188)); // true
		System.out.println(isEvenNumber(3)); // false
	    System.out.println("-----");
		System.out.println(inRange(4)); // false
		System.out.println(inRange(13)); // true
		System.out.println(inRange(10)); // true
		System.out.println(inRange(21)); // false
	}
	
	// if the method argument within the range from 10 to 20 inclusive
	// then return true otherwise return false
	public static boolean inRange(int i) {
		// if (i >= 10 AND i <= 20) 
		
		if (i >= 10 && 20 >= i) {
			return true;
//			if (i <= 20) {
//				return true;
//			} else {
//				return false;
//			}
				
		} else {
			return false;
		}
	}
	
	public static boolean isEvenNumber(int number) {
		// to check if number even or odd we can use %
		// we can do number % 2 and if it's 0 then its even number		
		int res = number % 2;		
		if (res == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int min(int numOne, int numTwo) {
		// TODO
		// return smallest argument
		// Mac: command + shift + F
		// Win: Ctrl + shift + F
		
		if (numOne < numTwo) {
			return numOne;
		}
		return numTwo;
	}

	public static String badNum(int number) {
		// TODO
		// if number argument is 13 then return "bad number"
		// otherwise return "regular number"
		if (number == 13) {
			return "bad number";
		} else {
			return "regular number";
		}
	}

	public static void bigNum(int number) {
		// TODO
		// if number argument is greater or equal to 1000
		// then print "<number> is big number"
		// otherwise print "<number> is regular number"

		if (number >= 2000) {
			System.out.println(number + " is big number");
		} else {
			System.out.println(number + " is regular number");
		}
	}

	public static void luckyNumber(int num) {
		// TODO
		// if num argument is equal to 7
		// print "Lucky number!"
		// otherwise print "Try tomorrow!"
		if (num == 7) {
			System.out.println("Lucky number!");
		} else {
			System.out.println("Lucky number!");
		}
	}
}
