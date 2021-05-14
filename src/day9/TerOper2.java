package day9;

public class TerOper2 {
	public static void main(String[] args) {
		int score = 80;
		String msg;
		
		// if score is greater than 100 assign msg as "great score"
		// otherwise "regular score" by using ternary operator
		
		msg = score > 100 ? "great score": "regular score"; 
		
		System.out.println(msg); // regular score	
	}
}
