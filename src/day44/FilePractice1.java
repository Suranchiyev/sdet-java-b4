package day44;

import java.io.File;
import java.io.IOException;

public class FilePractice1 {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/beknazarsuranchiyev/eclipse-workspace-2021/sdet-java-b4/io/test.txt");
		
		if (file.exists()) {
			System.out.println("Yes, it exists");
			System.out.println("We will delete it");
			
			// we can delete the file. The method returns boolean
			// if deleted -> true, if not -> false
			file.delete();
			
		} else {
			System.out.println("No, file is not there");
			System.out.println("We will create one");
			
			// we can create a file. The method will return boolean
			// if created -> true, if not -> false
			file.createNewFile();
		}
		
		// TODO
		// sdet
		//   oop.pdf, slides.pdf, cat.png, test_cases.xlsx, ccfa.txt
		
		File sdetDir = new File("/Users/beknazarsuranchiyev/eclipse-workspace-2021/sdet-java-b4/io/sdet");
		// if sdet dir does not exist
		if (!sdetDir.exists()) {
			sdetDir.mkdir(); // make directory
		}
		
		String dirPath = sdetDir.getAbsolutePath();
		
		File f1 = new File(dirPath + "/oop.pdf");
		f1.createNewFile();
		
		File f2 = new File(dirPath + "/slides.pdf");
		f2.createNewFile();
		
		File f3 = new File(dirPath + "/car.png");
		f3.createNewFile();
		
		File f4 = new File(dirPath + "/test_cases.xlsx");
		f4.createNewFile();
		
		File f5 = new File(dirPath + "/ccfa.txt");
		f5.createNewFile();
	}
}
