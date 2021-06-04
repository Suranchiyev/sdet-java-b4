package day20;

public class Rainbow {
	public static void main(String[] args) {
		//                  [0]      [1]      [2]       [3]     [4]      [5]       [6]
		String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
		
		System.out.println("Length: " + colors.length);
		colors[0] = "abc";
				
		System.out.println(colors[0]);
		
		colors[0] = "red";
		
		// print each element of array in the new lines using for loop
		for (int i = 0; i < colors.length; i++) {
			System.out.println("Color: " + colors[i]);
		}
		System.out.println("==============");
		
		// print each element from the back of array in the new lines using for loop
		for (int i = colors.length - 1; i >= 0; i--) {
			System.out.println("Color: " + colors[i]);
		}
		
	}
}
