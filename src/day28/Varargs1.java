package day28;

public class Varargs1 {
	public static void main(String[] args) {
		printItOut("red"); 
		// Number of arguments: 1
		// red
		System.out.println("----");
		
		printItOut("black", "white"); 
		// Number of arguments: 1
		// black
		// white
		
		System.out.println("----");
		String c = "yellow";
		String c1 = "green";
		String c2 = "black";
		printItOut(c, c1, c2);
		
	}
	
	public static void printItOut(String... strArgs) {
		// You can work with varargs as with arrays
		System.out.println("Number of arguments: " + strArgs.length);
		
		for (int i = 0; i < strArgs.length; i++) {
			System.out.println(strArgs[i]);
		}
	}
}
