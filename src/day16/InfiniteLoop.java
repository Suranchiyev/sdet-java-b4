package day16;

public class InfiniteLoop {
	public static void main(String[] args) {
        boolean b = true;
        
		while (b) {
			System.out.println("Java is cool!");
			b = false;
		}
		
		int num = 5;
		int num1 = 3;
		//      
		while (num < num1) {
			System.out.println("Python is great!");
		}
	}
}	
