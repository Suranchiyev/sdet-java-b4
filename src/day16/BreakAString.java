package day16;

public class BreakAString {
	public static void main(String[] args) {
		//            01234
		String str = "hello world";		
		
		int i = 0;
		int len = str.length() - 1;
		
		while(i <= len) {
			System.out.println(str.charAt(i));
			i++;
		}
		
		System.out.println("----------");
		
		//             01234
		String str2 = "hello world";
		/* 
		 * e
		 * l
		 * p
		 * p
		 * a
		 */
		int iEnd = str2.length() - 1;
		
		while (iEnd >= 0) {
			System.out.println(str2.charAt(iEnd));
			iEnd--;
		}
	}
}
