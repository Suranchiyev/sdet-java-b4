package day44;

import java.io.File;

public class FilePractice {
	public static void main(String[] args) {
		// work with existing file
		// File is a class that represent file/directory in the file system
		// File class can create a file or delete it
		// File class will have meta data about the file
		// meta data is a data about data.
		// 
		// File file = new File(file_path);
		
		File myFile = new File("/Users/beknazarsuranchiyev/eclipse-workspace-2021/sdet-java-b4/io/notes.txt");
		
		System.out.println("File exist: " + myFile.exists());
		System.out.println("File name: " + myFile.getName());
		System.out.println("Absolute path: " + myFile.getAbsolutePath());
		
		System.out.println("Is file: " + myFile.isFile());
		System.out.println("Is directory: " + myFile.isDirectory());
		
		// to check the size of file we need to use .length()
		// it will return number of bytes,
		System.out.println("Size: " + myFile.length());
		
		// last modified date
		// 1626546672059
		// epoch date is number of seconds from Jan 1, 1970. Unix time stamp
		System.out.println("Last modified: " + myFile.lastModified());
		
		// file as directory
		File dir = new File("/Users/beknazarsuranchiyev/eclipse-workspace-2021/sdet-java-b4/io");
		System.out.println("Is Dir: " + dir.isDirectory());
		// Break till 2:57 PM EST
	}
}
