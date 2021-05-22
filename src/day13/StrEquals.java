package day13;

public class StrEquals {
	public static void main(String[] args) {
		// To compare two strings on equality
		// we always need to use .equals() method
		
		String box = "apple";
		String box1 = "apple";
		
		if (box.equals(box1)) {
			System.out.println("They are equal!");
		} else {
			System.out.println("Not equal!");
		}
		
		System.out.println(box1.equals(box)); // true
				
		// ==
		System.out.println("equal equal: " + (box == box1));
		
		String name = "John Doe";
		String name1 = new String("John Doe");
		
		System.out.println(name); // John Doe
		System.out.println(name1); // John Doe
		
		// .equals() method will compare actual content
		System.out.println(name.equals(name1)); // true
		System.out.println(name == name1); // false
		
		// == when comparing object references it will check if two
		// references are pointing to the same object or not
	}
}
