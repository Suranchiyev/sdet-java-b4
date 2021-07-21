package day44;

import java.io.File;

public class FileTask {
	public static void main(String[] args) throws Exception {
		// sdet dir
		File rootSdet = new File("/Users/beknazarsuranchiyev/eclipse-workspace-2021/sdet-java-b4/io/sdet");
		File f = new File(rootSdet.getAbsolutePath() + "/pom.xml");
		f.createNewFile();
		
		// src dir
		File srcDir = new File(rootSdet.getAbsolutePath() + "/src");
		srcDir.mkdir();
		File f1 = new File(srcDir.getAbsolutePath() + "/hello.txt");
		f1.createNewFile();
		File f2 = new File(srcDir.getAbsolutePath() + "/oop.txt");
		f2.createNewFile();
		
		// target dir
		File targetDir = new File(rootSdet + "/target");
		targetDir.mkdir();
		File f3 = new File(targetDir.getAbsolutePath() + "/test.xlsx");
		f3.createNewFile();
		
		
	}
}
