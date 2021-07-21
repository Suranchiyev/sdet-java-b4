package day44;

import java.io.IOException;

public class ExceptionPractice {
	
	public static void main(String[] args) {
		try {
			m1();
		} catch (RuntimeException e) {
			System.out.println("Exception is handled");
		}
		
		try {
			m2();
		} catch (Exception e) {
			System.out.println("Exception is handled");
		}
	}
	
	public static void m1() {
		throw new IllegalArgumentException("My exception");
	}
	
	public static void m2() throws IOException {
		throw new IOException();
	}
}
