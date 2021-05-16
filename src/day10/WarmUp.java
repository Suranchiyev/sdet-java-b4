package day10;

public class WarmUp {	
	public static void main(String[] args) {
		getNumStr(7); 
	}
	// 7 and 13 they are special
	public static void getNumStr(int num) {
		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 7:
		case 13:
			System.out.println("Special");
			break;
		default:
			System.out.println("Not supported");
			break;
		}
		
	}
}
