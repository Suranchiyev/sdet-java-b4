package day45;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
	public static void main(String[] args) {
		// TODO
		// Print names only with odd length from Names.txt file
		
		try (BufferedReader r = new BufferedReader(new FileReader("src/day45/Names.txt"))) {
			
			r.lines().forEach(line -> {
				
				if (line.trim().length() % 2 == 1) {
					System.out.println(line);
				}
				
			});
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// TODO 
		// Get sum of all numbers from Num.txt file
		
		int sum = 0;
		
		try (BufferedReader r = new BufferedReader(new FileReader("src/day45/Num.txt"))) {
			String line;
			while ((line = r.readLine()) != null) {
				sum += Integer.parseInt(line.trim());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("The sum is " + sum);
	}
}
