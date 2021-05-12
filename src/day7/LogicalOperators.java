package day7;

public class LogicalOperators {
	public static void main(String[] args) {
		// && - AND (&)
		// || - OR (|)
		// !  - NOT
		
		int n = 20;
		
		// if number is between 10 and 50 inclusive
		boolean b = n >= 10 && n <= 50;
		// When AND (&&) is used, it will true when all conditions are true
		System.out.println(b);
		
		// if number is 7 or 10 or 20 then true
		boolean b2 = n == 7 || n == 10 || n == 20;
		// if one of the conditions is true, the whole expression is true
		System.out.println(b2);
		
		boolean b3 = !true;
		// NOT (!) will reverse value of boolean
		System.out.println(b3); // false
		
		// TODO       f    OR  t   AND  t
		boolean a = 2 == 1 || true && 4 >= 3;     // t, 
		//             t   AND t
		boolean c = !false && true;               // t, 
		//                 t   AND      f
		boolean e = 20 % 2 == 0 && !(5 / 2 <= 2); // f, 
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(e);
		
		//             t   AND t  AND  t AND f
		boolean a2 = true && true && 5 > 3 && false;  // f
		
		//              f  OR   f   OR   t  OR f
		boolean c2 = false || false || true || false; // t
		
		System.out.println(a2);
		System.out.println(c2);
		
		// && vs &
		// || vs |
	}
}
