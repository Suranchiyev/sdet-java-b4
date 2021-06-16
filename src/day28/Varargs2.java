package day28;

public class Varargs2 {
	public static void main(String[] args) {
		String res = join("abc", "bca");
		System.out.println(res);
		
		String res2 = join("A", "B", "C", "D");
		System.out.println(res2);
		
		String[] strArr = {"a", "b", "c", "d"};
		String res3 = join(strArr);
		System.out.println(res3);
	}
	
	public static String join(String... strs) {
		StringBuilder sb = new StringBuilder();
		
		for (String str : strs) {
			sb.append(str);
		}
		
		return sb.toString();
	}
	
	// We can create overloaded methods with varargs
	public static String join(int... nums) {
		StringBuilder sb = new StringBuilder();
		
		for (int num : nums) {
			sb.append(num);
		}
		
		return sb.toString();
	}
	
	// 0. Varargs can be used only in the method argument
	// 1. Only one varargs per method
	// 2. If there are more argument together with varargs, varargs should last argument
	public static void printAll(int num, String str, String... strs) {
		
	}
	
	
}
