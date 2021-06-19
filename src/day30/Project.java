package day30;

public class Project {
	public static void main(String[] args) {
		// 1. Validation. To determine if card number is valid or not
		//    - regular validation(Visa uses 13)
		//    - Luhn's Algorithm
		
		// 2. To determine type of card
		//    - American Express numbers start with 34 or 37
		//    - MasterCard numbers start with 51, 52, 53, 54, or 55
		//    - Visa numbers start with 4
		
		String strCard = args[0];
		//System.out.println(strCard);
		
		if (isValidCard(strCard)) {
			String cardType = getCardType(strCard);
			System.out.println(cardType);
		} else {
			System.out.println("INVALID");
		}
	}
	
	public static boolean isValidCard(String cardStr) {
		long creditCard = Long.parseLong(cardStr);
		if (creditCard <  0 || cardStr.length() < 13) {
			return false;
		}
		
		
		// Luhn's algorithm
		String sumProducts = "";
		for (int i = cardStr.length() - 2; i >= 0; i-=2) {
			String everyOtherNumStr = String.valueOf(cardStr.charAt(i));
			sumProducts += Integer.parseInt(everyOtherNumStr) * 2;
		}
		System.out.println(sumProducts);
		
		int sumOfProducts = 0;
		for (char ch : sumProducts.toCharArray()) {
			sumOfProducts += Integer.parseInt(String.valueOf(ch));
		}
		
		for (int i = cardStr.length() - 1; i >= 0; i -= 2) {
			String everyOtherNumStr = String.valueOf(cardStr.charAt(i));
			sumOfProducts += Integer.parseInt(everyOtherNumStr);
		}
		
		System.out.println(sumOfProducts);
		return false;
	}
	
	public static String getCardType(String cardStr) {
		return null;
	}
}
