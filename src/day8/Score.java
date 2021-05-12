package day8;

public class Score {
	public static void main(String[] args) {
		// A, B, C, D, F
		char grade = 'A';
		String scoreMsg;
		
		if (grade == 'A') {
			scoreMsg = "More than 90";
			
		} else if (grade == 'B') {
			scoreMsg = "Within 80 - 90 range";
			
		} else if (grade == 'C') {
			scoreMsg = "Within 70 - 80 range"; 
			
		} else if (grade == 'D') {
			scoreMsg = "Within 60 - 70 range";
			
		} else if (grade == 'F') {
			scoreMsg = "Less than 60";
			
		} else {
			scoreMsg = "Undefined grade";
		}
		
		System.out.println("Grade: " + grade);
		System.out.println("Msg: " + scoreMsg);
	}
}
