package day20;

public class Fruit {
	public static void main(String[] args) {
		String[] fruit = new String[4];	
		fruit[0] = "orange";
		fruit[1] = "kiwi";
		fruit[2] = "banana";
		fruit[3] = "apple";
		//     0         1         2          3
		// ["orange"] ["kiwi"] ["banana"] ["apple"]
		
		String str = fruit[1];
		System.out.println(str); // kiwi
		
		fruit[0] = fruit[0].toUpperCase();
		
		// [String 0] [String 1] [String 2] ..
		// We can treat each element of array as a single variable of that type
		
		fruit[2] = "cherries";
		
		System.out.println("-------");
		System.out.println(fruit[0]);
		System.out.println(fruit[1]);
		System.out.println(fruit[2]);
		System.out.println(fruit[3]);
	}
}
