package officehours1;

public class MethodsReview {
	public static void main(String[] args) {
		sayHello("Good morning");
		
		System.out.println("-----");
		
		sayHello("Good evening");
		
		boolean res = isOdd(222);
		System.out.println(res); // false
		System.out.println("----");
		
		div5or15(55); //My number
		System.out.println("----");
		
		div5or15(15); //Bingo
		System.out.println("----");
		
		div5or15(4); // Regular number
		
		System.out.println("=========");
		
		div5or15Second(55); //My number
		System.out.println("----");
		
		div5or15Second(15); //Bingo
		System.out.println("----");
		
		div5or15Second(4); // Regular number
	}
	
	public static void div5or15Second(int number) {
		if (number == 15) {
			System.out.println("Bingo");
		} else if (number % 5 == 0) {
			System.out.println("My number");
		} else {
			System.out.println("Regular number");
		}
	}
	
	// Can void method have a return statement?
	// if number is divisible evenly by 5 print "My number"
	// if number is 15 print "Bingo"
	// otherwise print "Regular number"
	public static void div5or15(int number) {
		//   t
		if (number == 15) {
			System.out.println("Bingo");
			// when we have empty return in void method,
			// it will exit from the method
			return;
		}
		
		if (number % 5 == 0) {
			System.out.println("My number");
		} else {
			System.out.println("Regular number");
		}
	}
	

	public static boolean isOdd(int number) {
		if (number % 2 == 1) {
			return true;
		}
		
		return false;
	}

	public static void sayHello(String str) {
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
	}
}
