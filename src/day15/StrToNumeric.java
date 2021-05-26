package day15;

public class StrToNumeric {
	public static void main(String[] args) {
		// String to numeric
		// byte = Byte.parseByte(strNum);
		// short = Short.parseShort(strNum);
		// int = Integer.parseInt(strNum);
		// long = Long.praseLong(strNum);
		// float = Float.parseFloat(strNum);
		// double = Double.parseDouble(strNum);
		// to make sure price is between 50-100 inclusive
		String price = "89";
		inRangePrice(price);
		
		price = "101.99";
		inRangePrice(price);
	}
	
	public static void inRangePrice(String str) {
		if (str.contains(".")) {
			
			double price = Double.parseDouble(str);
			if (price >= 50 && price <= 100) {
				System.out.println("Test pass");
			} else {
				System.out.println("Test failed");
			}
			
		} else {
			
			int price = Integer.parseInt(str);
			if (price >= 50 && price <= 100) {
				System.out.println("Test pass");
			} else {
				System.out.println("Test failed");
			}
			
		}
		
		
	}
}
