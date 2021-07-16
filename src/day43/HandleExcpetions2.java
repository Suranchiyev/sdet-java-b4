package day43;

public class HandleExcpetions2 {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str);
		
		try {
			
			str = str.toUpperCase();
			System.out.println(str);
			
		} catch (NullPointerException e) {
			System.out.println("str was null");
		}

		
		// TODO if there is exception handle it by using try catch statement
		//       - print "str was null"
	}
}
