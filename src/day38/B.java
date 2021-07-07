package day38;

import java.util.List;

public class B extends A {
	// TODO Override each method of class A
	// Implementation is up to you
		
	// @Override will check if we are overriding it correctly
	@Override
	public void m1(String str) {
		System.out.println(str);
	}
	
	@Override
	public String m2() {
		
		return "hello, friends!";
	}
	
	@Override
	public int m3(int i, int i2) {
		return Math.max(i, i2);
	}
	
	@Override
	public void loopOver(List<String> list) {
		System.out.println("-----");
		// this refers to current object
		
		// super refers to parent class object
		super.loopOver(list);
		
		System.out.println("-----");
	}
	
	
	
}
