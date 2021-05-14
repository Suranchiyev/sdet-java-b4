package day9;

public class GroceryStore {
	public static void main(String[] args) {
		printPrice("bread"); 
		
		System.out.println("------");
		printPrice("apple"); // apple - $1.50
		
		System.out.println("------");
		printPrice("beer"); // beer - $7.90
		
	}
	
	/*
	 * bread - 4.99
	 * water - 2.99
	 * red bull - 2.59
	 * apple   -  1.50
	 * beer    -  7.90
	 * Other items - Not valid item
	 */
	public static void printPrice(String item) {
		switch(item) {
		case "bread":
			System.out.println(item + " - $4.99");
			break;
		case "water":
			System.out.println(item + " - $2.99");
			break;
		case "red bull":
			System.out.println(item + " - $2.59");
			break;
		case "apple":
			System.out.println(item + " - $1.50");
			break;
		case "beer":
			System.out.println(item + " - $7.90");
			break;
		default:
			System.out.println("Not valid item");
			break;
		}	
	}
}
