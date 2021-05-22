package day13;
import java.util.Random;


public class RandomStudent {
	public static void main(String[] args) {
		Random random = new Random();
		
		int randomNumber = random.nextInt(6); // from 0 to 5
		System.out.println(randomNumber);
		
		switch(randomNumber) {
		case 0:
			System.out.println("Warachai Wongwichit");
			break;
		case 1:
			System.out.println("Anna Kachmazova");
			break;
		case 2:
			System.out.println("Kelsey Yusupov");
			break;
		case 3:
			System.out.println("Irina Grigoryan");
			break;
		case 4:
			System.out.println("Oleksandr Bilosorochka");
			break;
		case 5:
			System.out.println("Madi Makhmutov");
			break;
		}
	}
}
