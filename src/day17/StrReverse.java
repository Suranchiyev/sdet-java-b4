package day17;

public class StrReverse {
	public static void main(String[] args) {
		//            01234
		String str = "Hello WOrld";
		String strRev = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			strRev += str.charAt(i);
		}
	
		System.out.println(strRev); // elppa
	}
}
