package day28;

public class WrapperDemo {
	public static void main(String[] args) {
		StringAdv str = new StringAdv("hello");
		
		System.out.println(str);
		System.out.println("Length: " + str.length());
		
		System.out.println(str.substring(1, 3));
		
		System.out.println(str.reverse());
	}
}
