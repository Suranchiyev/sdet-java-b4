package day44;

import java.io.File;

public class FileCount {
	public static int count = 0;
	
	public static void main(String[] args) {
		File rootSdet = new File("/Users/beknazarsuranchiyev/eclipse-workspace-2021/sdet-java-b4/io/sdet");
		File[] filesAndDirUnderSdet = rootSdet.listFiles();
		
		System.out.println("Number of files and dir: " + filesAndDirUnderSdet.length);
		for (File file : filesAndDirUnderSdet) {
			System.out.println("------------------------");
			System.out.println("Name: " + file.getName());
			System.out.println("Is file: " + file.isFile());			
		}
		
		System.out.println("---------------------------");
		int nFiles = countFile("/Users/beknazarsuranchiyev/eclipse-workspace-2021/sdet-java-b4");
		System.out.println("Number of files under project: " + nFiles);
		
		count = 0;
		System.out.println("Number of files in Desktop: " + countFile("/Users/beknazarsuranchiyev/Desktop"));
	}
	
	public static int countFile(String path) {
		File dir = new File(path);
		
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			
			if (files != null) {
				for (File file : files) {
					if (file.isFile()) {
						// count
						count++;
					} else {
						countFile(file.getAbsolutePath());
					}
				}
			}
		}
		
		return count;
	}
}
