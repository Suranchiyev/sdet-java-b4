package day40;

public class D extends C {
	@Override
	public void m1() {
		System.out.println("Hello, World!");
	}
	
	@Override
	public String m2(String str) {
		return str.toUpperCase();
	}
	
	@Override
	public int m3(int i, int i2) {
		return i + i2;
	}
}
