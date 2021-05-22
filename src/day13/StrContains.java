package day13;

public class StrContains {
	public static void main(String[] args) {
		// .contains(string)
		// it will check if string contains another string
		// returns boolean
		
		String topic = "Variables, assignment operator, arithmetic opertor, terminal";
		
		boolean isThere = topic.contains("operator");
		System.out.println(isThere); // true
		
		System.out.println(topic.contains("java")); // false
		System.out.println(topic.contains("terminal")); // true
		System.out.println(topic.contains("or, ar")); // true
		System.out.println(topic.contains("bles,  ")); // false
		
		String str = "Var";
		System.out.println(topic.contains(str)); // true
		
		System.out.println(str.contains(topic)); // false
	}
}
