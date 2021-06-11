package day24;

import java.util.Arrays;

public class CodingTask {
	public static void main(String[] args) {
		String[] a1 = {"red", "green", "blue"};
		String[] a2 = {"yellow", "white", "black", "indigo"};
		
		// TODO make one array out of this two arrays	
		// print this big array each element in the new lines		
		
		String[] bigArray = new String[a1.length + a2.length];
		
		for (int i = 0; i < a1.length; i++) {
			bigArray[i] = a1[i];
		}
		
		for (int i = 0; i < a2.length; i++) {
			bigArray[a1.length + i] = a2[i];
		}
		
		// [red, green, blue, yellow, white, black, indigo]
		System.out.println(Arrays.toString(bigArray));
		
		for (String value : bigArray) {
			System.out.println(value);
		}
//		for (int i = 0; i < bigArray.length; i++) {
//			System.out.println(bigArray[i]);
//		}
	}
}
