package day7;

public class MethodsReview {
	public static void main(String[] args) {
		printThree("Python");	
		printThree("JS");
		
		String res = join("Java", "Python", "JS");
		System.out.println(res);
	}
	
	public static void printThree(String str) {
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
	}
	
	public static String join(String s, String s1, String s2) {
		return s + s1 + s2;
	}
}
