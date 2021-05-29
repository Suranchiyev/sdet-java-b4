package day17;

public class ForLoop3 {
	public static void main(String[] args) {
		// break; will exit from the loop
		
		for (int i = 0; i <= 1000; i++) {
			if (i == 7) {
				break;
			}
			
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// continue; will skip this iteration
		
		// program will print from 1 to 100
		// but it will skip 7, 13, 9
		
		for (int i = 1; i <= 100; i++) {			
			if (i == 7 || i == 13 || i == 9) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		String str = "Ap$pl#e";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '$' || ch == '#') {
				continue;
			}
			//                  
			System.out.println(ch);
		}
	}
}
