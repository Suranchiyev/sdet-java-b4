package day3;

public class IncrementAndDecrement {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num); // 10
		
		num += 1;
		System.out.println(num); // 11
		
		num++; // post increment operator
		System.out.println(num); // 12
		
		num++;
		System.out.println(num); // 13
		
		// pre increment operator. It will increase value in the same statement
		System.out.println(++num); // 14
		System.out.println(num); // 14
		
		// pre increment ++num, It will increase value by 1 in the same statement
		// post increment num++, it will increase value by 1 in the next statement
		
		num = 10;
		num--; // decrement operator will decrease value by 1
		
		System.out.println(--num); // 8
		System.out.println(num--); // 8
		System.out.println(num);   // 7		
		
		// post will take effect in the next statement
		// pre will take effect right away
	}
}
