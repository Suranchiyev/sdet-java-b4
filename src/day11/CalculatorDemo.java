package day11;

public class CalculatorDemo {
	public static void main(String[] args) {
		int res = CalculatorUtil.sum(55, 78, 23);
		System.out.println(res); // 
		
		res = CalculatorUtil.multiply(8, 3, 1);
		System.out.println(res);
		
		CalculatorUtil.printSum(4, 5);
	}
}
