package day22;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		// java.util.Arrays is a helper class for an array
		// Arrays.toString(array) - it will print all elements in one line
		
		int[] nums = {6, 4, 3, 2, 9, 5};
		System.out.println(nums); 
		System.out.println(Arrays.toString(nums));
		
		// Array is fixed size collection of data of the same type
		
		String[] names = new String[3];
		names[0] = "Ang";
		names[1] = "Kora";
		names[2] = "Katara";
	
		
		String[] names2 = new String[4];
		
		
		
		for (int i = 0; i < names.length; i++) {
			names2[i] = names[i];
		}
		
		names2[3] = "Soka";
		
		names = names2;
		System.out.println(Arrays.toString(names));
	}
}
