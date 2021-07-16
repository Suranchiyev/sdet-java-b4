package day43;

public class SomeExceptions {
	public static void main(String[] args) {
		// NullPointerException
		String str = null;
		System.out.println(str); // null
		
		// We get NullPointerException when our pointer/object is null
		// and we try to use some methods or properties of that object
		// str = str.toLowerCase(); // NullPointerException
		
		System.out.println(str);
		System.out.println("Hello World!");
		
		// When we hit exception the current thread(program) will stop and
		// throw the exception msg to the console
		
		
		//String strNum = "123ad";
		String strNum = "123";
		int num = Integer.parseInt(strNum); // NumberFormatException
		num = num * 2;
		System.out.println(num);
		
		int[] arr = {1, 2, 3};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// System.out.println(arr[3]); // ArrayIndexOutOfBoundsException:
	}
}
