package day45;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteBytesStream {
	public static void main(String[] args) throws Exception {
		File file = new File("src/day45/test.txt");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		
		try (OutputStream out = new FileOutputStream(file)) {
			
			out.write(72); // H
			out.write(73); // I
			
			out.write(542); 
			out.write(74); 
			out.write(752); 
			out.write(102); 
			out.write(100);
			out.write(100);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
