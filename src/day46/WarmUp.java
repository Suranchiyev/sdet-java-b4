package day46;

import java.util.HashMap;
import java.util.Map;

public class WarmUp {
	public static void main(String[] args) {
		String[] strArr = {"white", "black", "green", "red", "yellow"};
		Map<String, Integer> resMap = getColorsLen(strArr);
		System.out.println(resMap); // {white=5, black=5, green=5, red=3, yellow=6}
		
		strArr = new String[]{"aa", "a", "abcd"};
		resMap = getColorsLen(strArr);
		System.out.println(resMap); // {aa=2, a=1, abcd=4}
	}
	
	public static Map<String, Integer> getColorsLen(String[] strArr) {
		Map<String, Integer> map = new HashMap<>();
		
		for (String str : strArr) {
			map.put(str, str.length());
		}
		
		return map;
	}
}
