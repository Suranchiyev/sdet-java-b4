package day21;

public class MaxValue {
	public static void main(String[] args) {
		// Find biggest value by using brute force algorithm
		int[] arr = {100, 43, 235, 3};
		
		// print biggest value in the array
		
		// to take each number one by one
		out:
		for (int i = 0; i < arr.length; i++) {
			//   235         2
			int numVal = arr[i];
			
			boolean isBiggest = true;
			
			// inner loop to check if number is biggest
			inner:
			for (int j = i + 1; j < arr.length; j++) {
				
				// if we numVal was not biggest stop inner loop
				if (numVal < arr[j]) {
					isBiggest = false;
					break;
				}
			}
			
			// if the number was biggest stop the outer loop and print that number
			if (isBiggest) {
				System.out.println("Biggest: " + numVal);
				break;
			}
		}
	}
}
