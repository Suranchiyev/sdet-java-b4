package day47;

public class Methods {
	
	public int sum(int i, int i2) {
		return i + i2;
	}
	
	public String reverse(String str) {
		String rev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		return rev;
	}
	
	public boolean isEven(int i) {
		return i % 2 == 0;
	}
	
	public boolean isOdd(int i) {
		return i % 2 == 1;
	}
	
	public void revArr(int[] arrNum) {
		int e = arrNum.length - 1;
		
		for (int s = 0; s < arrNum.length / 2; s++) {
			int tmp = arrNum[s];
			arrNum[s] = arrNum[e];
			arrNum[e] = tmp;
			e--;
		}
	}
	
	public void fisrtLast(int[] arrNum) {
		int tmp = arrNum[0];
		arrNum[0] = arrNum[arrNum.length - 1];
		arrNum[arrNum.length - 1] = tmp;
	}
	
}
