package day4;

public class Var3 {
	public static void main(String[] args) {
		String str = "Good";
		//   "Good" + " morning";
		str = str + " morning";
		
		System.out.println(str); // Good morning
		
		int number = 19;
		//     =   19   + 10
		number = number + 10;
		System.out.println(number); // 29
	
		System.out.println(number + 10); // 39
		System.out.println(number);      // 29
	}
}
