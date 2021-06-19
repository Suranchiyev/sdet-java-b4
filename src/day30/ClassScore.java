package day30;

import java.util.ArrayList;
import java.util.List;

public class ClassScore {
	public static void main(String[] args) {
		List<Double> scores = new ArrayList<>();
		scores.add(89.9);
		scores.add(100.0);
		scores.add(78.1);
		scores.add(99.0);
		scores.add(65.5);
		System.out.println(scores);
		
		double sum = 0;
				
		//TODO find out sum of scores from scores list
		for (double score : scores) {
			sum += score;
		}
		System.out.println("Total sum: " + sum);
	}
}
