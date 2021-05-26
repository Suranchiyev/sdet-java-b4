package day16;

public class HelloWorld {
	public static void main(String[] args) {
		// TODO
		// Write a program that will print 1000 times "Hello, World!"
		// Use while 
		// Each statement in new lines
		
		int i = 0;
		while (i < 1000) {
			System.out.println("Hello, World! - " + i);
			i++;
		}
		
		System.out.println("======");
		// TODO
		// print numbers from 10 to 1 by using while loop
		// ex: 10 9 8 7 6 5 4 3 2 1
		
		int i2 = 10;
		//     0
		while (i2 > 0) {
			System.out.print(i2 + " ");
			i2--;
		}
	
	}
}
