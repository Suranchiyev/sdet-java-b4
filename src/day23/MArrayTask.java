package day23;

import java.util.Arrays;

public class MArrayTask {
	public static void main(String[] args) {
		int[][] nums = 
			{
					{1532, 1113, 1124, 1134, 1145},
					{1158, 1191, 1208, 1225, 1242},
					{1216, 1174, 1191, 1208, 1225},
					{1276, 1262, 1286, 1311, 1335},
					{1340, 1338, 1370, 1403, 1436},
					
			};
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.deepToString(nums));
		System.out.println("------");
		
		int sum = 0;
		int averageValue = 0;
		int count = 0;
		// TODO write a code to find out sum of all elements in the nums array
		// TODO find out average value of nums array
		
		for (int i = 0; i < nums.length; i++) {
			// count += nums[i].length;
			
			for (int j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];
				count++;
			}
		}
		
		System.out.println("Sum: " + sum);
		
		averageValue = sum / count;
		System.out.println("Averge: " + averageValue);
	}	
}
