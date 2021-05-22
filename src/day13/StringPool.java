package day13;

public class StringPool {
	public static void main(String[] args) {
		String str = "apple";
		String str1 = "apple";
		
		String str2 = new String("apple");
		
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		// how does == operator work when comparing two objects(references)?
		// Java will try to reuse same String objects if their content are same
		
		System.out.println(str == str1); // true
		System.out.println(str == str2); // false
		
		// equals method always will check actual content
		System.out.println(str.equals(str1)); // t 
		System.out.println(str.equals(str2)); // t
	}
}
