package day6;

public class ReturnMethods {
	public static void main(String[] args) {
		// return data back
		String res = getHello();
		System.out.println(res); // hello
		
		String str = getHello();
		
		int res2 = getMyLuckyNum();
		System.out.println(res2); // 7
	}
	
	public static String getHello() {
		String str = "hello";		
		return str;
	}
	
	public static int getMyLuckyNum() {
		// int i = 7;
		return 7;
	}
}
