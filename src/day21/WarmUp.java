package day21;

public class WarmUp {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 9, 7};
		System.out.println(isSevenThere(arr)); // true
		
		System.out.println(isSevenThere(new int[] {9, 6, 5})); // false
		System.out.println(isSevenThere(new int[] {1, 7}));    // true
		System.out.println(isSevenThere(new int[] {7, 7}));    // true
	}
	
	/*
	 * isSevenThere([1, 3, 5, 9, 7]) -> true
	 * isSevenThere([9, 6, 5])       -> false
	 * isSevenThere([1, 7])          -> true
	 * isSevenThere([7, 7])          -> true
	 */
	public static boolean isSevenThere(int[] arrNum) {
		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] == 7) {
				return true;
			}
		}
		
		return false;
	}
}
