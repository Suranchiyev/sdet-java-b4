package day19;

public class PassByReference {
	public static void main(String[] args) {
		int number = 7;
		changeNum(number);
		System.out.println(number); // 7
		
		String myWord = "hello";
		changeStr(myWord);
		System.out.println(myWord); // hello
		
		StringBuilder sb = new StringBuilder("hello");
		changeSb(sb);
		System.out.println(sb); // hello, world 
		
		// Primitives and String will not get change if we are passing them into the method
		// and changing value there.
		// 
		// Other objects will get change because they work with references.
	}
	
	public static void changeSb(StringBuilder sbInput) {
		// sbInput = sb;
		sbInput.append(", world");
	}
	
	public static void changeStr(String str) {
		// str = myWord;
		str = str + ", world!";	
	}
	
	public static void changeNum(int num) {
		// num = number;
		num = 100;
	}
}
