package day6;

public class MethodArguments2 {
	public static void main(String[] args) {
		//    abcabc
		String str = join("abc", "abc");
		System.out.println(str); // abcabc
		
		str = join("apple", "orange");
		System.out.println(str); // appleorange
		
		System.out.println("============");
		
		String firstName = "John";
		String lastName = "Doe";
		int age = 35;
		printInfo(firstName, lastName, age);
		
		printInfo(lastName, firstName, age);
		
		//(String fName, String lName, int age)
		printInfo("John", "Doe", 35);
		printInfo("John", "Doe", 35);
		printInfo("John", "Doe", 35);
	}
	
	public static void printInfo(String fName, String lName, int age) {
		System.out.println("First name: " + fName);
		System.out.println("Last name: " + lName);
		System.out.println("Age: " + age);
	}
	
	public static String join(String str, String str1) {
		System.out.println("str: " + str);
		System.out.println("str1: " + str1);
		String res = str + str1;
		return res;
	}
}
