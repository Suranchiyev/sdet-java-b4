package day22;

public class StrAndChars {
	public static void main(String[] args) {
		String str = "hello";
		
		// "hello" -> [h, e, l, l, o]
		char[] chArr = str.toCharArray();
		
		System.out.println(chArr[0]); // h
		System.out.println(chArr[1]); // e
		System.out.println("===========");
		// TODO
		// write a code that will print each element of chArr in the new line
		// by using forEach loop
		
		for (char eachChar : chArr) {
			System.out.println("Each char: " + eachChar);
		}
		System.out.println("==========");
		
		String str2 = "John Doe";
		for (char ch : str2.toCharArray()) {
			System.out.println(ch);
		}
	}
}
