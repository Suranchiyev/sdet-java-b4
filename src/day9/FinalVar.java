package day9;

// 1. Instance
// 2. Static
// 3. Local variables
public class FinalVar {
	public String firstName;
	public static String address = "101 Main st";
	
	public static final double RUBLE_EXCHANGE_RATE = 0.013;
	
	public static void main(String[] args) {
		final String name = "John Doe";
		System.out.println(name);
		
		// name = "Will Smith";
		
		System.out.println(exchangeRate(1000));
		System.out.println(exchangeRate(5000));
	}
	
	public static double exchangeRate(final int rubles) {
		// rubles = 10;
		return rubles * RUBLE_EXCHANGE_RATE;
	}
}
