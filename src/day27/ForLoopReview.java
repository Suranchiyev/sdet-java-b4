package day27;

public class ForLoopReview {
	public static void main(String[] args ) {
		// for loops
		
		// for (init part; condition, update)
		// init part - we usually declare some variable
		// condition - if its true, keep iterating. When it's false, stop
		//             each iteration java will check condition
		// update    - usually we update our variable so the condition will change
		
		for (int i = 0; i < 5; i++) {			
			System.out.println("Hello, world!");
		}
		System.out.println("-------");
		
		// TODO print 7 times "Java is the best" by using for loop
		for (int i = 0; i < 7; i++) {
			System.out.println("Java is the best");
		}
		System.out.println("-------");
		
		// TODO print number from 1 to 15 in the same line separated by space by using for loop
		for (int i = 1; i <= 15; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------");
		
		// TODO print numbers from 999 to 1 in the same line separated by space by using for loop              
		for (int i = 999; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------");
		
		String str = "hello, world!";
		// TODO print each letter of str string in the new lines
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("-------");
		
		// TODO print each letter of str string in the reverse order
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}
}
