package day23;

public class WarmUp {
	public static void main(String[] args) {
		//                   0       1      2       3          4
		String[] colors = {"red", "blue", "green", "white", "yellow"};
		printArrRev(colors);
		
		System.out.println(isValueThere(colors, "green")); // true
		System.out.println(isValueThere(colors, "blue")); // true
		System.out.println(isValueThere(colors, "black")); // false
		System.out.println(isValueThere(colors, "abc")); // false
	}
	
	/*
	 * print array in reverse order in the new lines
	 *   0  1  2  3   
	 * [[] [] [] [] ]
	 * 
	 */
	public static void printArrRev(String[] strArr) {
		for (int i = strArr.length - 1; i >= 0; i--) {
			System.out.println(strArr[i]);
		}
	}
	
	/*
	 * isValueThere(["red", "green"], "red");  -> true
	 * isValueThere(["red", "green"], "blue"); -> false
	 * 
	 * isValueThere(["red", "green", "blue"], "blue"); -> true
	 * 
	 * 1. loop throw array
	 * 2. if (eachEl.equals(value)) {return true}
	 * 3. Outside of loop return false
	 */
	public static boolean isValueThere(String[] strArr, String value) {
//		for (int i = 0; i < strArr.length; i++ ) {
//			if (value.equals(strArr[i])) {
//				return true;
//			}
//		}
		
		for (String str : strArr) {
			if (value.equals(str)) {
				return true;
			}
		}
		
		return false;
	}
}
