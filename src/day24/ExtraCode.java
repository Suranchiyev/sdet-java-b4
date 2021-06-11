package day24;

import java.util.Arrays;

public class ExtraCode {
	public static void main(String[] args) {
		String[] a1 = {"red", "green", "blue"};
		String[] a2 = {"yellow", "white", "black", "indigo"};
		
		String strArr1 = Arrays.toString(a1).replace("[","").replace("]","");
		String strArr2 = Arrays.toString(a2).replace("[","").replace("]","");
		String res = strArr1 +", "+ strArr2;
		res = res.replace(" ", "");
		String[] bigArray = res.split(",");
		System.out.println(Arrays.toString(bigArray));
	}
}
