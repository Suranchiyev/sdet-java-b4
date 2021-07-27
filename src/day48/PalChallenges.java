package day48;

public class PalChallenges {
	public static void main(String[] args) {
		System.out.println(isPalindrome2("anna"));  // true
		System.out.println(isPalindrome2("level")); // true
		System.out.println(isPalindrome2("apple")); // false
		System.out.println(isPalindrome2("civic")); // true
		System.out.println(isPalindrome2("hello")); // false
		System.out.println("=======");
		System.out.println(isPalNum2(1001)); 
		System.out.println(isPalNum2(123)); 
		System.out.println(isPalNum2(707)); 
		
	}
	
	/*
	 * isPalindrome("anna");  -> true
	 * isPalindrome("level"); -> true
	 * isPalindrome("apple"); -> false
	 * Time Complexity: O(n) - linear
	 */
	public static boolean isPalindrome(String str) {
		StringBuilder rev = new StringBuilder();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev.append(str.charAt(i));
		}
		
		return rev.toString().equals(str);
	}
	
	/*
	 * isPalindrome("anna");  -> true
	 * Time Complexity: O(n / 2) -> O(n) linear
	 */
	public static boolean isPalindrome2(String str) {
		int j = str.length() - 1;
		
		for (int i = 0; i < str.length() / 2; i++) {
			char startCh = str.charAt(i);
			char endCh = str.charAt(j);
			
			if (startCh != endCh) {
				return false;
			}
			
			j--;
		}
		
		return true;
	}
	
	/*
	 * isPalNum(545);  -> true
	 * isPalNum(1001); -> true
	 * isPalNum(13);   -> false
	 * isPalNum(75);   -> false
	 */
	public static boolean isPalNum(int num) {
		String strNum = String.valueOf(num);
		
		// reusing the above method
		return isPalindrome2(strNum);
	}
	
	/*
	 * Do it without String conversion
	 * 
	 * isPalNum(545);  -> true
	 * isPalNum(1001); -> true
	 * isPalNum(13);   -> false
	 * isPalNum(75);   -> false
	 * O(n) - linear
	 */
	public static boolean isPalNum2(int num) {
		// if we want to get the most right number, we can use % by 10
		// if we want to remove the most right number, we can use / by 10
		
		int copyOfNum = num;
		int rev = 0;
		int rightMost;
		
		// when num is 0, there is no numbers
		while (num > 0) {
			rightMost = num % 10;// get right most    
			rev = (rev * 10) + rightMost; // concatenate to rev the right most
			num = num / 10;	 // remove the right most
		}
			
		return copyOfNum == rev;
	}
}





