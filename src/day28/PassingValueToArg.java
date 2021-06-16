package day28;

import java.util.Arrays;

public class PassingValueToArg {
	public static void main(String[] args) {
		int myNumber = 55;
		changeNum(myNumber);
		System.out.println(myNumber); // 55
		
		String myStr = "Good evening";
		changeStr(myStr);
		System.out.println(myStr); // Good evening
		
		// Pass by value
		Integer num = 123;
		changeInteger(num);
		System.out.println(num); // 123
		
		Car honda = new Car("Honda civic", 25000);
		changeCar(honda);
		System.out.println(honda.model); // Honda civic
		System.out.println(honda.price); // 23000.0
		
		int[] numArr = {1, 2, 3, 4, 5};
		swap(numArr);
		System.out.println(Arrays.toString(numArr)); // [5, 2, 3, 4, 1]
	}
	
	// Pass By Value - data type will not change original value that has been passed
	public static void changeNum(int num) {
		num = 99;
	}
	
	public static void changeStr(String str) {
		str = "hello";
	}
	
	public static void changeInteger(Integer num) {
		num = 9;
	}
	
	// Pass By Reference
	public static void changeCar(Car car) {
		car.price = 23000;
	}
	
	public static void swap(int[] arr) {
		int tmp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = tmp;
	}
 }
