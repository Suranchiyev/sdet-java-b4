package day34;

import java.util.Map;
import java.util.HashMap;

public class MapWithCustomObj {
	public static void main(String[] args) {
		//     K   , V
		Map<Integer, Student> myClass = new HashMap<>();
		
		Student student =  new Student("John", 78);
		
		myClass.put(1, student);
		myClass.put(2, new Student("Alex", 85));
		myClass.put(3, new Student("Ramesh", 99.9));
		myClass.put(4, new Student("Kuba", 75.5));
		
		// TODO print out Ramesh score from the map?
		double rameshScore = myClass.get(3).score;
		System.out.println("Ramesh's scor is " + rameshScore);
		
		// TODO can you print each Object from the map in this format
		// Student id: <key>, name: <name>, score: <score>
		// Student id: 1, name: John, score: 78
		
		for (Integer keyId : myClass.keySet()) {
			String name = myClass.get(keyId).name;
			double score = myClass.get(keyId).score;
			System.out.println("Student id: " + keyId + ", name: " + name + ", score: " + score);
		}
		
		
		
	}
}
