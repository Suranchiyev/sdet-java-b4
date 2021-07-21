package day45;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class TryWithResources {
	public static void main(String[] args) {
		File file = new File("src/day45/notes.txt");
		
		StringBuilder content = new StringBuilder();
		
		try (InputStream in = new FileInputStream(file)) {
			int b;
			while ((b = in.read()) != -1) {
				content.append((char)b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(content);
	}
}
