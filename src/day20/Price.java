package day20;

public class Price {
	public static void main(String[] args) {
		double[] price = new double[8];
		price[0] = 9.99;
		price[1] = 14.89;
		price[2] = 1.50;
		price[3] = 29.9;
		price[4] = 1.2;
		price[5] = 20;
		price[6] = 29;
		price[7] = 22;
		
		// Find average value from array price
		
		// double sum = price[0] + price[1] + price[2] + price[3] + price[4] + price[5];
		double sum = 0;
		
		// .length will return number of elements in the array
		int arrLen = price.length;
		
		for (int i = 0; i < arrLen; i++) {
			sum = sum + price[i];
		}
		
		double average = sum / arrLen;
		
		average = Math.round(average);
		System.out.println("Average price: " + average);
	}
}
