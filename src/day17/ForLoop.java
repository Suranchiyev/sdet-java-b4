package day17;

public class ForLoop {
	public static void main(String[] args) {
		// while loops - we use when we don't know exact number of
		//               iterations in advance
		// for loops - we use it when we know exact number of iterations
		//             in advance
		
		//       i = 0; 10 < 10
		for (int i = 0; i < 10; i++) {
			System.out.println("Java is cool: " + i);
		}
		
		// int i = 0; -> init part
		// i < 10;    -> condition part. If its true keep iterating
		// i++;       -> update action
		
		for (int i = 0; i < 1000; i += 5) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		// 100 -> 0
		
		for (int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}		
	}
}




