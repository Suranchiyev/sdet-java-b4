package day18;

public class StrRemoveDup {
	public static void main(String[] args) {
		String str = "apapleap";
		String strNoDup = "";
		
		// contains
		for (int i = 0; i < str.length(); i++) {
			//     p
			char letter = str.charAt(i);
			                   
			//    "ap"  does not contains "p"
			if (!strNoDup.contains(String.valueOf(letter))) {
				// "ap"
				strNoDup = strNoDup + letter;
			}
			
		}
		
		System.out.println(strNoDup); // aple
		
	}
}
