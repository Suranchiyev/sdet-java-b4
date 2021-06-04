package day20;

public class Temp {
	public static void main(String[] args) {
		
		double[] temp = new double[]{32, 30, 25.7, 26, 34, 31.5, 29};
		
		// find out sum of values in the array temp
		double sum = 0.0;
		
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		System.out.println("Sum: " + sum);
		
		double averageTemp = sum / temp.length;
		System.out.println("Average: " + averageTemp);
		
		// Print out all the temp from array that is greater than average
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > averageTemp) {
				System.out.println(temp[i]);
			}
		}
		
	}
}
