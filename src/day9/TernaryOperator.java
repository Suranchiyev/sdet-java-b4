package day9;

public class TernaryOperator {
	public static void main(String[] args) {
		int y = 10;
		int x;
		
		// if y is greater than 5 assign x = y * 2;
		// otherwise x = y * 3;
		if (y > 5) {
			x = y * 2;
			
		} else {
			x = y * 3;
		}
		System.out.println(x);
		
		//=   C   ?   T   :  F
		x = y > 5 ? y * 2 : y * 3;
		System.out.println(x);
		System.out.println("--------");
		
		boolean isEven = false;
		//           false  ?                  :       
		String str = isEven ? "Number is even" : "Number is odd";
		System.out.println(str);
		System.out.println("--------");
		
		//             F   ?        T   ? 8 : 7
		int number = 5 > 6 ? 4 : (6 > 5 ? 8 : 7);
		System.out.println(number); // 8
		
		
		//            F   ?               
		number = (8 > 20) ? (10 < 7 ? 4 : 3) : (9 < 0 ? 5 : 22);
		
		System.out.println(number); // 22
		System.out.println("-------");
		
		//              
		String str1 = 5 > 3 ? "Java" : "python";
		System.out.println(str1); // Java
		
//		double dNum = false ? 23 : 23.43;		
//		int n = true ? 54 : 8;
	}
}



