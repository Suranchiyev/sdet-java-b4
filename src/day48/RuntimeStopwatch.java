package day48;

import java.time.Duration;
import java.time.Instant;

public class RuntimeStopwatch {
	
	public static void main(String[] args) {
		print1000();
		
		// Milliseconds: 15
	}
	
	public static void print1000() {
		Instant start = Instant.now();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Hello, World!");
		}
		
		Instant finish = Instant.now();
		
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Milliseconds: " + timeElapsed);
	}
}
