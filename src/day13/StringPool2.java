package day13;

public class StringPool2 {
	public static void main(String[] args) {
		// 1. When String object will be created without new keyword,
		//    it will be stored in the String Pool memory
		
		// 2. If we will have another String with same value
		//    java will reuse existing object
		
		String str = "wooden spoon";
		String str1 = "wooden fork";
		String str2 = "wooden fork";
		
		System.out.println(str == str1); // false
		System.out.println(str1 == str2); // true
		
		// 2 objects will be created in String Pool
		// WE NEVER USE == to compare string values on equality
		// we always .equals() method
	}
}
