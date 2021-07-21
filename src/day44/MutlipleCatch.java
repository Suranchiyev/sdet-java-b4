package day44;

public class MutlipleCatch {
	public static void main(String[] args) {
		// Can you have multiple catch blocks?
		// Yes, we can, but the smaller(parent child) exceptions should be first and then larger after
		// Lunch break till 1:05 PM EST
		
		try {
			String str = null;
			System.out.println(str.toUpperCase()); // NullPointerExcpetion
			
		} catch (IllegalArgumentException e) {
			System.out.println("Second catch: " + e);
			
		} catch (NullPointerException e) {
			System.out.println("Firs catch: " + e);
			
		} catch (RuntimeException e) {
			System.out.println("Third catch: " + e);
			
		}
	}
}
