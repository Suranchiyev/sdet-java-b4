package day12;

public class StrMethodReview {
	public static void main(String[] args) {
		// String is immutable object in java that represents sequence of characters between 
		// double quotes 
		// immutable - once created we cannot modify original value
		
		String str = "apple";
		// length() -> return number of chars in the String
		
		int len = str.length(); // return is int
		System.out.println("Number of chars: " + str.length());
		
		// toUpperCase and toLowerCase
		System.out.println(str);
		System.out.println(str.toUpperCase());
		
		str = str.toUpperCase();
		System.out.println(str); // APPLE
		System.out.println(str.toLowerCase()); // apple
		
		System.out.println("--------");
		
		// substring(start) and substring(start, end)
		//             012345678910
		String str1 = "Hello, World";
		System.out.println(str1.substring(7));
		
		System.out.println(str1); // Hello, World
		System.out.println(str1.substring(0, 5)); // Hello
		System.out.println(str1.substring(5, 6)); // ,
		System.out.println("--------");
		
		// indexOf(char or String) and charAt(index)
		//             0123
		String str2 = "Java";
		 
		System.out.println(str2.indexOf('v')); // 2
		System.out.println(str2.indexOf("J")); // 0
		System.out.println(str2.indexOf("a")); // 1
		
		// if string or char is not part of the value 
		// it will return negative index
		System.out.println(str2.indexOf("z")); // -1
		
		// charAt(index) - it will return char based on index
		// return type is char
		                         
		//             0123456789  ....  20
		String str3 = "python is good";
		
		char ch = str3.charAt(7);
		System.out.println(ch); // i
		System.out.println(str3.charAt(10)); // g
		System.out.println(str3.charAt(0));  // p
		
		// System.out.println(str3.charAt(20)); // StringIndexOutOfBoundsException
	}
}
