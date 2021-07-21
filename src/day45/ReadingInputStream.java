package day45;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadingInputStream {
	public static void main(String[] args) {
		// absolute path - /Users/beknazar/../../notes.txt
		// relative path - src/day45/notes.txt
		// relative from where the program is running
		
		File file = new File("src/day45/notes.txt");
		System.out.println(file.exists());
		
		StringBuilder sb = new StringBuilder();
		
		InputStream in = null;
		
		try {
			in = new FileInputStream(file);
			int b;
			
			while ((b = in.read()) != -1) {
				sb.append((char)b);
			}
			
			// in.close();
			
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(sb);
	}
}
