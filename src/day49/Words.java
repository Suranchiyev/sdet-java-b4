package day49;

public class Words {
	public static void main(String[] args) {
		String str = "apple";
		String str1 = "apple";
		String str2 = new String("apple");
		
		System.out.println(str == str1); // true - they are pointing to same object
		System.out.println(str == str2); // false - they are not pointing to the same obj
		System.out.println(str.equals(str2)); // true 
		
		// What's String Pool memory in Java?
		// String pool is a memory for String values
		// String will reuse same object if they are identical
		
		// How does == operator work with object references?
		// if they are pointing to the same object or not
		// true -> if they are
		// false -> they are not
		
		// .equals compares the actual content
	}
}
