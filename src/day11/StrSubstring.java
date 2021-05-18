package day11;

public class StrSubstring {
	public static void main(String[] args) {
		// Some methods of String will use counting position of char
		// the position begins with 0. Usually we refer to it as
		// index
		
		//            012345678910
		String str = "Java is fun";
		
		// substring(start), substring(start, end)
		System.out.println(str);
		System.out.println(str.substring(8));
		System.out.println(str.substring(5));
		System.out.println(str);
		
		//             0123456789
		String str1 = "SoftSkills";
		System.out.println(str1.substring(4)); // Skills
		
		//      012345678910
		str1 = "Java is fun";
		System.out.println(str1.substring(0, 4)); // Java
		System.out.println(str1.substring(5, 7)); // is
		System.out.println(str1.substring(1, 3)); // av
		
		//             012345678
		String str2 = "workspace";
		str2 = str2.substring(0, 4);
		System.out.println(str2); // work
		
		//              0123456789
		String str4  = "HelloWorld"; // loW
		String str5  = "SDLC"; // DL
		String str6  = "Sublime"; // bl
		String str7  = "Window"; // ind
		String str8  = "OptimizePDF"; // PDF
		String str9  = "Navigate"; // Nav
		String str10 = "Search"; // ear
		
		System.out.println(str4.substring(3, 6)); // loW
		System.out.println(str5.substring(1, 3)); // DL
		System.out.println(str6.substring(2, 4)); // bl
		System.out.println(str7.substring(1, 4)); // ind
		System.out.println(str8.substring(8));    // PDF
		System.out.println(str9.substring(0, 3)); // Nav
		System.out.println(str10.substring(1, 4));// ear
	} 
}
