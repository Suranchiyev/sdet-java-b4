package day45;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderAndWriter {
	public static void main(String[] args) {
		File file = new File("src/day45/notes.txt");
		
		// BufferedReader
		// FileReader
		
		try (BufferedReader r = new BufferedReader(new FileReader(file))) {
			String line;			
			while ((line = r.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("============");
		
		StringBuilder sb = new StringBuilder();
		try(BufferedReader r = new BufferedReader(new FileReader(file))) {
			
			r.lines().forEach(line -> {
				sb.append(line.trim());
				sb.append("\n");
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(sb);		
	}
}
