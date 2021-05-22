package day14;

public class StrMethods {
	public static void main(String[] args) {
		// startsWith and endsWith
		
		String str = "Hello, world!";
		
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.endsWith("ld!")); 
		
		String str1 = "  200 ";
		System.out.println(str1);
		
		str1 = str1.trim(); // trim will remove spaces around the value
		
		System.out.println(str1);
		int num = Integer.parseInt(str1);
		if (num > 50) {
			System.out.println("Test pass");
		}
		
		String str2 = "   Java is great programming language !  ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
	}
}
