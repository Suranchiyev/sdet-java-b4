package day46;

public class ShoppingBalanceDemo {
	public static void main(String[] args) {
		// Singleton design pattern
		// When we want to have only one instance
		// of the particular class in the memory any
		// given time.
		
		// Break till 8:24 PM EST
		
		ShoppingBalance balance = ShoppingBalance.getInstance();
		balance.buy("head phone", 300.00);
		System.out.println("-----------");
		
		ShoppingBalance balance2 = ShoppingBalance.getInstance();
		balance2.buy("phone", 500.00);
		
		System.out.println("==============");
		
		ShBalanceLazy b = ShBalanceLazy.getInstance();
		b.buy("apple", 5.99);
		b.buy("orange", 3.50);
		
		System.out.println("---");
		
		ShBalanceLazy b1 = ShBalanceLazy.getInstance();
		b1.buy("kiwi", 6.99);
		b1.buy("banana", 1.5);
		
		// 1. private constructor
		// 2. Create static property of the same type - instance
		// 3. Provide public getInstance() where you check
		//    if instance is null initialize otherwise just return
		//    it
		
//		ShBalanceLazy bl = ShBalanceLazy.getInstance(5000);
//		
//		bl.buy("books", 2000);
//		bl.buy("courses", 2000);
//		
//		ShBalanceLazy bl2 = ShBalanceLazy.getInstance();
//		bl2.buy("apple", 20);
	}
}
