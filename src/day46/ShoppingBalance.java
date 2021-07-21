package day46;

public class ShoppingBalance {
	public double balance;
	
	private static final ShoppingBalance instance;
	
	static {
		instance = new ShoppingBalance(2000.0);
	}
	
	private ShoppingBalance(double balance) {
		this.balance = balance;
	}
	
	public static ShoppingBalance getInstance() {
		return instance;
	}
	
	public void buy(String item, double price) {
		balance = balance - price;		
		System.out.println("Bought: " + item);
		System.out.println("Price: " + price);
		System.out.println("Remaining balance: " + balance);
	}
}
