package day46;

public class ShBalanceLazy {
	private double balance;
	private static ShBalanceLazy instance;
	
	private ShBalanceLazy(double balance) {
		this.balance = balance;
	}
	
	public static ShBalanceLazy getInstance(double balance) {
		if (instance == null) {
			instance = new ShBalanceLazy(balance);
			return instance;
		}
		
		return instance;
	}
	
	public static ShBalanceLazy getInstance() {
		if (instance == null) {
			instance = new ShBalanceLazy(1000.0);
			return instance;
		}
		
		return instance;
	}
	
	public void buy(String item, double price) {
		balance = balance - price;		
		System.out.println("Bought: " + item);
		System.out.println("Price: " + price);
		System.out.println("Remaining balance: " + balance);
	}
}
