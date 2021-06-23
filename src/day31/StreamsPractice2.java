package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice2 {
	public static void main(String[] args) {
		// collect -> Collectors
		
		List<String> fruits = 
				new ArrayList<>(Arrays.asList("Apple", "Kiwi", "Orange", "dragon fruit", "mango"));
		System.out.println(fruits);
		
		String strFruit = fruits.stream().collect(Collectors.joining(", "));
		System.out.println(strFruit);
		System.out.println(strFruit.toUpperCase());
		
		// distinct - removes duplicates
		List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 2, 4, 5, 5, 5, 6, 9, 9, 10));
		System.out.println(nums);
		
		List<Integer> noDupNums = nums.stream().distinct().collect(Collectors.toList());
		System.out.println(noDupNums);
		
		// pipeline
		List<String> strs = new ArrayList<>();
		strs.add("a");
		strs.add("ab");
		strs.add("c");
		strs.add("abc");
		strs.add("aa");
		strs.add("qwer");
		strs.add("ytrww");
		strs.add("yerywe");
		strs.add("qwersgfdg");
		strs.add("ytrwsgw");
		strs.add("yerywfsde");
		
		// length -> no dup -> only even -> List<Integer>
		List<Integer> resList = 
				strs.stream()
				.map(str -> str.length())
				.distinct()
				.filter(element -> element % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(resList);
		
		//Stream<String> stream = Stream.of("a", "b", "c", "d");
		//stream.map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));
		System.out.println("=========");
		
		List<Integer> listNums = new ArrayList<>(Arrays.asList(4, 3, 1, 2, 3, 4, 5, 6, 7));
		System.out.println(listNums); // [4, 3, 1, 2, 3, 4, 5, 6, 7]
		
		// *
		// [***, *, **, ***, ****, *****, ******, *******]
		List<String> astList = listNums.stream().map((Integer n) -> {
			
			String astStr = "";
			for (int i = 0; i < n; i++) {
				astStr += "*";
			}
			return astStr;
			
		}).collect(Collectors.toList());
		System.out.println(astList);
		System.out.println("========");
		System.out.println(listNums);
		
		List<Integer> listNumsMore5 = listNums.stream().filter(num -> num > 5).collect(Collectors.toList());
		System.out.println(listNumsMore5);
		
		// Break till 2:20 PM EST
	}
}
