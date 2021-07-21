package day45;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	public static void main(String[] args) {
		// InputStream and OutputStream are good when we work with all type file except text.
		
		
		// copy("src/day45/notes.txt", "src/day45/notes_copy.txt");
		// System.out.println("--------------");
		
		// copy("src/day45/LengthUpperLowerCases.mp4", "src/day45/videoCopy.mp4");
		// System.out.println("--------------");
		
		copyWithBuffer("src/day45/LengthUpperLowerCases.mp4", "src/day45/videoBufferCopy.mp4");
	}
	
	public static boolean copyWithBuffer(String sourcePath, String targetPath) {
		System.out.println("Start copy with buffer");
		File sourceFile = new File(sourcePath);
		File targetFile = new File(targetPath);
		
		try (InputStream in = new FileInputStream(sourceFile);
			 OutputStream out = new FileOutputStream(targetPath)) {
			
			// creating buffer - we want to read more than one byte a time
			byte[] buffer = new byte[1024]; // size of the buffer is size of byte[]
			
			int b; // write
			while ((b = in.read(buffer)) != -1) {
				
				out.write(buffer, 0, b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		System.out.println("End copy with buffer");
		return true;
	}
	
	public static boolean copy(String sourcePath, String targetPath) {
		System.out.println("Start copy");
		File sourceFile = new File(sourcePath);
		File targetFile = new File(targetPath);
		
		try (InputStream in = new FileInputStream(sourceFile);
			 OutputStream out = new FileOutputStream(targetPath)) {
			
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		System.out.println("End copy");
		return true;
	}
}
