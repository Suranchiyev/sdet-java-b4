package day19;

public class SbMethods {
	public static void main(String[] args) {
		// charAt(), indexOf(), length(), substring(), equals
		// these methods work exactly the way they work with string
		//                                     012345
		StringBuilder day = new StringBuilder("Sunday");
		char ch = day.charAt(2);
		System.out.println(ch); // n
		
		int i = day.indexOf("d"); // 3
		System.out.println("Index of: " + i);
		
		System.out.println("Length: " + day.length());
		
		// substring() will return String
		//                           "Sun"
		day = new StringBuilder(day.substring(0, 3));
		System.out.println(day); // Sun
		
		// append() appends value to the StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("wooden").append(" spoon").append("!");
		sb.append(1).append(2);
		System.out.println(sb);
		
		System.out.println("---------");
		//                                     0123456
		StringBuilder sb1 = new StringBuilder("animals");
		System.out.println(sb1); // animals
		
		// insert(index, value);
		sb1.insert(3, "-");
		System.out.println(sb1); // ani-mals
		
		// 01234567
		// ani-mals  -> ani-ma$ls
		
		sb1.insert(6, "$");
		System.out.println(sb1); // ani-ma$ls
		
		//                                     012345678910
		StringBuilder sb2 = new StringBuilder("John programmer");
		System.out.println(sb2); // John programmer
		
		sb2.insert(4, " is");
		System.out.println(sb2); // John is programmer
		System.out.println("--------");
		
		// delete(int startIndex, int endIndex)
		// deleteCharAt(index)
		
		//                                     012345
		StringBuilder sb3 = new StringBuilder("abcdef");
		//                          012345
		System.out.println(sb3); // abcdef
		sb3.delete(2, 4);        // 0123
		System.out.println(sb3); // abef
		
		sb3.delete(1, 3);        // 01
		System.out.println(sb3); // af
		
		sb3.delete(0, 1);
		System.out.println(sb3); // f
		System.out.println("---------");
		
		//                                     012..                  ..
		StringBuilder sb4 = new StringBuilder("asdfbasdjfasvdlfadsfgcxertdsfassdfd");
		sb4.delete(1, sb4.length() - 1);
		System.out.println(sb4); // at
		System.out.println("---------");
		
		//                                    01234
		StringBuilder b5 = new StringBuilder("apple");
		System.out.println(b5);
		// it will delete one char based on index
		b5.deleteCharAt(1);
		System.out.println(b5);
		System.out.println("---------");
		
		// reverse() it will reverse value of StringBuilder
		
		StringBuilder b6 = new StringBuilder("Hello, World!");
		System.out.println(b6);
		
		b6.reverse();
		System.out.println(b6);
		System.out.println("---------");
		
		// How to convert StringBuilder to String?
		// How to convert String to StringBuilder?
		
		StringBuilder b7 = new StringBuilder("John Doe");
		String name = b7.toString();
		
		// Convert String to StringBuilder
		String str = "apple";
		StringBuilder b8 = new StringBuilder(str);
		
		b8.reverse();
				
		str = b8.toString();
		System.out.println(str);
		
		String str1 = "orange";
		str1 = new StringBuilder(str1).delete(1, str1.length() - 1).toString();
		System.out.println(str1);
	}
}
