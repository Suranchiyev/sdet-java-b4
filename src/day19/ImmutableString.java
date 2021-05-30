package day19;

public class ImmutableString {
	public static void main(String[] args) {
		// String is immutable object
		// Once we create its not possible to change
		
		String str = "apple";
		str = str + ", orange";
		
		String str1 = "";
		for (int i = 0; i < 100; i++) {
			str1 = str1 + i;
		}
		
		// because of immutability of string each change will require new object.
		System.out.println(str1);
		
		// StringBuilder is mutable version of String
	}
}
