package day34;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(removeDup("hello")); // helo
		System.out.println(removeDup("apple")); // aple
		System.out.println(removeDup("aaa")); // a
		System.out.println(removeDup("aakkaa")); // ak	
		
		System.out.println("---------");
		System.out.println(removeDup2("hello")); // helo
		System.out.println(removeDup2("apple")); // aple
		System.out.println(removeDup2("aaa")); // a
		System.out.println(removeDup2("aakkaa")); // ak	
	}
	
	/*
	 * remove duplicates from str by using logic with Set
	 * Set data structure does not allow duplicates
	 */
	public static String removeDup2(String str) {
		Set<Character> set = new LinkedHashSet<>();
		
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		// System.out.println(set);
		
		StringBuilder noDupSb = new StringBuilder();
		for (char ch : set) {
			noDupSb.append(ch);
		}
		
		return noDupSb.toString();
	}
	
	/*
	 * method removes all duplicates from str and returns it
	 * By using contains method 
	 */
	public static String removeDup(String str) {
		String noDupStr = "";
		
		for (char ch : str.toCharArray()) { 	 
			if (noDupStr.indexOf(ch) < 0) {
				noDupStr += ch;
			}
		}
		
		return noDupStr;
	}
}
