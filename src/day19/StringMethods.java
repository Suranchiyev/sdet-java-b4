package day19;

public class StringMethods {
	public static void main(String[] args) {
		// length()        -> number of characters
		// charAt(index)   -> based on index return single char
		// indexOf(char)
		// indexOf(String) -> it will return index of the string/char
		// toLowerCase()
		// toUpperCase()
		// substring(start)
		// substring(start, end) -> returns substring based on indexes
		// replace(old, new) -> it will replace old values with new ones
		// trim()            -> it removes white spaces around the String
		// equals(str)       -> to compare strings on equality
		// equalsIgnoreCase(str) -> compares strings by ignoring their cases
		// contains(str)     -> it will check if string contains another string
		// startsWith(String)
		// endsWith(String)
		// compareTo(string) -> to check alphabetic order(positive, negative, or 0)
		// String.valueOf()  -> convert primitives to String 
		
		// split()
	    // toCharArray()
		// ===============================
		
		// length()
		String str = "good afternoon class!";
		// White spaces will counted for .length() method
		int len = str.length();
		System.out.println("Length: " + len);
		
		
		// charAt(index) -> we can get specific char based on index
		//     012345678910
		str = "Wooden spoon";
		char ch = str.charAt(0);
		System.out.println(ch); // W
		
		char lastChar = str.charAt(str.length() - 1);
		System.out.println(lastChar);
		
		// indexOf(String) -> returns index of argument string
		//     01234567
		str = "John Doe";
		int index = str.indexOf("o");
		System.out.println(index);
		str = "Hello, {John Doe}! How are you?";
		int startIndex = str.indexOf("{");
		int endIndex = str.indexOf("}");
		
		String value = "Kuba";
		
		String firstPart = str.substring(0, startIndex);
		String secondPart = str.substring(endIndex + 1);
		
		str = firstPart + value + secondPart;
		System.out.println(str);
		
		str = "kiwi";
		str = str.toUpperCase();
		System.out.println(str); // KIWI
		
		str = str.toLowerCase();
		System.out.println(str); // kiwi
		
		// substring(start)
		// substring(start, end)
		//     012345678910
		str = "wooden spoon";
		System.out.println(str.substring(0, 6)); // wooden
		System.out.println(str.substring(7));    // spoon
		System.out.println(str.substring(4, 9)); // en sp
		
		// replace(old, new)
		System.out.println(str); // wooden spoon
		
		str = str.replace("o", "e");
		System.out.println(str); // weeden speen
		
		// trim() removes spaces around the string value
		str = "  I am a programmer  ";
		System.out.println(str);
		str = str.trim(); // it will remove spaces from the from and the back
		System.out.println(str);
		
		// comparing the strings
		// to compare two strings on equality we must use .equals() method
		
		str = "java";
		String str1 = "Java";
		
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.equals(str1));
		
		if (str.equals(str1)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		
		str = "Java is the best programming language";
		System.out.println(str.contains("best"));  // true
		System.out.println(str.contains("is"));    // true
		System.out.println(str.contains("java"));  // false
		System.out.println(str.contains("st pr")); // true
		System.out.println("------");
		System.out.println(str.startsWith("Java is the")); // true
		System.out.println(str.startsWith("is the"));      // false
		System.out.println(str.endsWith("language"));      // true
		System.out.println(str.endsWith("lan"));           // false
		
		System.out.println("------");
		String n  = "Alex";
		String n2 = "Bek";
		String n3 = "Kuba";
		// n -> n2 -> n3
		
		//          n3 is in correct by alphabetical order to n2 then positive number
		System.out.println(n3.compareTo(n2)); // 9
		System.out.println(n2.compareTo(n)); // 1
		
		// compareTo can check correct place of two strings based on their alphabetical order
		
		// 0
		String n4 = "John";
		String n5 = "John";
		System.out.println(n4.compareTo(n5)); // for equal values we will get 0
		
		System.out.println("--------");
		
		// String.valueOf() - converts primitives into String
		int num = 99;
		String numStr = String.valueOf(num);
		numStr = num + "";
	}
}










