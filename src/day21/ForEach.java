package day21;

public class ForEach {
	public static void main(String[] args) {
		//                 0         1       2      3          4
		String[] names = {"Alex", "John", "Kuba", "Ramesh", "Vijay"};
		int len = names.length;
		System.out.println("Size: " + len);
		
		//                        5 - 1 = 4
		String lastName = names[names.length - 1];
		System.out.println(lastName);
		System.out.println("================");
		
		//              0   1   2   3
		int[] numArr = {99, 10, 11, 13, 100, 34, 90, 55, 51, 67};
		// print numbers from array that greater than 50
		//              10 < 10
		for (int i = 0; i < numArr.length; i++) {	
			//                  numArr[9]
			int singleElement = numArr[i];
			
			if (singleElement > 50) {
				System.out.println(singleElement);
			}
		}
		
		System.out.println("===============");
		// numArr = [99, 10, 11, 13, 100, 34, 90, 55, 51, 67]
		// for each
		for (int num : numArr) {
			if (num > 50) {
				System.out.println("Num value: " + num);
			}
		}
		
		System.out.println("===============");
		
		String[] team = {"PRISM", "CRA", "QUATRO", "FLASH", "AWS"};
		// 
		for (String tName : team) {
			System.out.println(tName);
		}
		System.out.println("===========");
		
		
		double[] dNumArr = {3.5, 6.7, 8.9, 9.9, 10.99};
		// TODO print each element of dNumArr using for each loop
		for (double d : dNumArr) {
			System.out.println(d);
		}
		System.out.println("===========");
		
		char[] chArr = {'a', 'b', 'c', 'd', 'e'};
		// TODO print each element of chArr using for each loop
		for (char ch : chArr) {
			System.out.println(ch);
		}
		
		System.out.println("===========");
		
		StringBuilder[] sbArr = {new StringBuilder("apple"), new StringBuilder("orange")};
		// TODO print each element of sbArr using for each loop
		for (StringBuilder sb :  sbArr) {
			System.out.println(sb);
		}
		System.out.println("===========");
		
		String[] cars = {"Audi", "BMW", "Honda"};
		// TODO print each element of cars using for each loop
		for (String car : cars) {
			System.out.println(car);
		}
		System.out.println("===========");
	}
}
