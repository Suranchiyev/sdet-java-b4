package day7;

public class LogicalOperators2 {
	public static void main(String[] args) {
		// && vs &
		int n = 3;
		
		//    f          
		if (n > 5 & n++ < 15) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		System.out.println(n); // 4
		System.out.println("-----");
		
		n = 3;
		// || vs |
		
		//     t   OR    f
		if (n == 3 || (n = 5) == 4) {
			System.out.println("Yes!");
		}
		
		System.out.println(n); // 5
		
	}
}
