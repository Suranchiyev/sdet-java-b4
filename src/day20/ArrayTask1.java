package day20;

public class ArrayTask1 {
	public static void main(String[] args) {
		int[] number = new int[3];
		number[0] = 5;
		number[1] = 7;
		number[2] = 15;
		
		// .length will return number of elements
		System.out.println("Length: " + number.length); // 3
		
		for (int num = 0; num < number.length; num++) {
			System.out.println(number[num]);
		}
		
//		System.out.println(number[0]);
//		System.out.println(number[1]);
//		System.out.println(number[2]);
		
		double[] temperature = new double[6];
		temperature[0] = 95.5;
		temperature[1] = 55.5;
		temperature[2] = 76.8;
		temperature[3] = 9.2;
		temperature[4] = 96.9;
		temperature[5] = 92.1;
		
		System.out.println(temperature[0]);                                    
		System.out.println(temperature[temperature.length - 1]);
	}
}
