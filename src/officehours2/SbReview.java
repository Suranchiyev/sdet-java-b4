package officehours2;

public class SbReview {
	public static void main(String[] args) {
		// String vs StringBuilder?
		// String is immutable and StringBuilder is mutable

		// When do you use String vs StringBuilder?
		// When we change value of String very often its better
		// to use StringBuilder

		StringBuilder str = new StringBuilder("#");

		for (int i = 0; i < 100; i++) {
			str.append("#");
		}

		System.out.println(str);
		
		System.out.println(str.substring(0, 5));
		
		System.out.println("Length: " + str.length());
		
		// create StringBuilder with init value "apple"
		StringBuilder sb = new StringBuilder("apple");
		sb.append(", orange");
		
		System.out.println(sb); // apple, orange
		sb = new StringBuilder("kiwi");
		System.out.println(sb); // kiwi
		// 0123
		// kiwi
		
		System.out.println(sb.substring(1, 3)); // iw
		System.out.println(sb.delete(1, 3)); // ki
		
		System.out.println(sb.reverse());
		
		// 01
		// ik
		
		sb.insert(1, "abc");
		System.out.println(sb);
		// ------
		
		StringBuffer sbf = new StringBuffer("hello, wordl!");
		// StringBuffer is synchronized(thread safe) and 
		// StringBuilder is not thread safe.
	}
}
