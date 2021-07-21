package day45;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriter2 {
	public static void main(String[] args) {
		// BufferedWriter
		// FileWriter
		
		List<String> listStr = new ArrayList<>();
		listStr.add("Encapsulation");
		listStr.add("Inheritance");
		listStr.add("Abstraction");
		listStr.add("Polymorphism");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/day45/oop.txt"))) {
			
			for (String str : listStr) {
				bw.write(str);
				bw.newLine();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
