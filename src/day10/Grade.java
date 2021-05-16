package day10;

public class Grade {
	public static void main(String[] args) {
		System.out.println(getScore('A')); // 90-100
		System.out.println(getScore('b')); // 65-89
	}
	
	/**
	 * if 'A' or 'a' return "90-100"
	 * if 'B' or 'b' return "65-89"
	 * if 'C' or 'c' return "50-64"
	 * if 'F' or 'f' return "50"
	 */
	public static String getScore(char grade) {
		//      'A'
		switch(grade) {
		case 'A':
		case 'a':
			// when we have return st. it will exit our method
			return "90-100"; 
			// break; unreachable
		case 'B':
		case 'b':
			return "65-89";
		case 'C':	
		case 'c':
			return "50-64";
		case 'F':
		case 'f':
			return "50";
		default:
			return "Invalid grade";
		}
	}
}
