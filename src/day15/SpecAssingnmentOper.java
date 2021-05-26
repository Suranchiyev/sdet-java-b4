package day15;

public class SpecAssingnmentOper {
	public static void main(String[] args) {
		// +=, -=, *=, /=, %=
		// ++, --
		
		int num = 7;
		//  =  7  + 10
		// num = num + 10;
		num += 10;
		
		System.out.println(num); // 
		System.out.println(num); // 
		
		// num = num - 5;
		num -= 5;
		System.out.println(num); // 12
		
		// num = num * 2;
		num *= 2;
		System.out.println(num); // 24
		
		// num = num / 2;
		num /= 2;
		System.out.println(num); // 12
		
		// num = num % 10;
		num %= 10;
		System.out.println(num); // 2
		// ==============================
		
		int i = 10;
		// i = i + 1;
		i++;
		System.out.println(i);
		
		// ++ it will increase value of numeric variables by 1
		// -- it will decrease value of numeric variables by 1
		// i++ post will take effect in the next use
		// ++i pre will take effect right away 
		
		i = 5;
		System.out.println(i++); // 5
		System.out.println(i); // 6
		System.out.println(--i); // 5
		
		
		int num2 = 7;
		int num3 = 8;
		
		//               16       -    7  +     9
		int res = num2++ + ++num3 - --num2 + num3++;
				
		System.out.println(res); //  18
		System.out.println(num2); // 7
		System.out.println(num3); // 10
		// -----------
		System.out.println("======");
		System.out.println(57 % 50);  // 7
		System.out.println(157 % 50); // 7
		System.out.println(7 % 5);    // 2
 		System.out.println(88 % 50);  // 38
		System.out.println(101 % 10); // 1
		System.out.println(400 % 10); // 0
		System.out.println(33 % 11);  // 0
		System.out.println(32 % 5);   // 2
		System.out.println(99 % 3);   // 0
		
		int num4 = 5;
		if (num4 % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
