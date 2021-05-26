package day15;

public class Score {
	enum ScoreValue {A, B, C, D, F}
	
	public static void main(String[] args) {
		printMsg(ScoreValue.B); // Good!
		printMsg(ScoreValue.D); // Bad!
		
		//printMsg();
	}
	
	/*
	 * A - Great!
	 * B - Good!
	 * C - Not bad!
	 * D - Bad!
	 * F - Bad! 
	 */
	public static void printMsg(ScoreValue scoreEnum) {
		switch(scoreEnum) {
		case A:
			System.out.println("Great!");
			break;
		case B:
			System.out.println("Good!");
			break;
		case C:
			System.out.println("Not bad!");
			break;
		case D, F:
			System.out.println("Bad!");
		    break;
		}
	}
}	
