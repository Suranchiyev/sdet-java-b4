package day38;

import java.util.List;

public class A {
	public void m1(String str) {
		System.out.println(str);
	}
	
	public String m2() {
		return "hello, world!";
	}
	
	public int m3(int i, int i2) {
		return Math.max(i, i2);
	}
	
	public void loopOver(List<String> list) {
		for (String str : list) {
			System.out.println(str);
		}
	}
	
}
