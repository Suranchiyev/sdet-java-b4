package day20;

public class Score {
	public static void main(String[] args) {
		//   0    1    2    3    4    5
		// [[70] [80] [66] [90] [87]] 
		
		int[] score = new int[5];	
		score[0] = 70;
		score[1] = 80;
		score[2] = 66;
		score[3] = 90;
		score[4] = 87;
		
		// ArrayIndexOutOfBoundsException 
		// array was created with size 5 and we tried to access 6th element
		// score[5] = 100;
		
		System.out.println(score);
		
		System.out.println(score[0]); // 70
		System.out.println(score[1]); // 80
		System.out.println(score[2]); // 66
		System.out.println(score[3]); // 90
		System.out.println(score[4]); // 87
		// System.out.println(score[5]);
		
		score[0] = score[2] + score[4]; 
		System.out.println(score[0]); // 153
		
	}
}
