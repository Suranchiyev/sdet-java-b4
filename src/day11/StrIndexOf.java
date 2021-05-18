package day11;

public class StrIndexOf {
	public static void main(String[] args) {
		/**
		 * indexOf(String)
		 * indexOf(char)
		 *  
		 *  to get index of specific char in the string
		 */
		
		//            012345
		String str = "applep";
		
		System.out.println(str.indexOf('l')); // 3
		System.out.println(str.indexOf("e")); // 4
		
		System.out.println(str.indexOf('p')); // 1
		System.out.println(str.lastIndexOf('p')); // 5
		
		System.out.println("index of second: " + str.indexOf('p', 3));
		
		//             01234567...      17
		String str1 = "Apple is red and orange is orange, and kiwi is green";
		System.out.println(str1.indexOf("orange"));
		//                                             32           45
		String str2 = "ajdhsadgsadgfdgdfaagagadfasdfls{Hello, World!}asdf;asdnf[faw";
		
		int indexF = str2.indexOf('{') + 1;
		int indexS = str2.indexOf('}');
		System.out.println(indexF);
		System.out.println(indexS);
		String res = str2.substring(indexF, indexS);
		System.out.println(res);
		
		}
}
