package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMap {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<>(Arrays.asList("red", "blue", "white", "black", "yellow"));
		
		// forEach and removeIf are build in into list itself
		// but for other stream operations we need to first make our stream from the list. 
		Stream<String> streamC = colors.stream();
		streamC.forEach(el -> System.out.println(el));
		System.out.println("==============");
		
		// map 
		// By using regular way
		List<Integer> colorLen = new ArrayList<>();
		for (String color : colors) {
			int len = color.length();
			colorLen.add(len);
		}
		System.out.println(colorLen); // [3, 4, 5, 5, 6]
		
		// by using stream map operator
//		List<Integer> colorLen2 = colors.stream().map(
//				(String el) -> {
//					return el.length();
//				}
//		).collect(Collectors.toList());
		
		List<Integer> colorLen2 = colors.stream().map(e -> e.length()).collect(Collectors.toList());
		System.out.println(colorLen2);
		
		// TODO put all elements from colors list as upper case 
		
		System.out.println("Original: " + colors);
		// Regular way
		List<String> colorsUpper = new ArrayList<>();		
		for (String color : colors) {
			String upp = color.toUpperCase();
			colorsUpper.add(upp);
		}
		System.out.println("Raguler way: " + colorsUpper);
		
		// TODO can you do it by using streams and map operator?
		List<String> colorsUpper2 = colors.stream().map(color -> color.toUpperCase()).collect(Collectors.toList());
		System.out.println("Stream map: " + colorsUpper2);
		System.out.println("===============");
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 3, 2, 1, 5, 6, 7, 8, 10));
		System.out.println(numbers);
		
		// TODO have another list which hold the same elements multiplied by 2 
		// Regular way
		List<Integer> numbers2 = new ArrayList<>();
		for (Integer number : numbers) {
			numbers2.add(number * 2);
		}
		System.out.println(numbers2); // [8, 6, 4, 2, 10, 12, 14, 16, 20]
				
		// Can you do it with streams and map
		List<Integer> numbers3 = numbers.stream().map(e -> e * 2).collect(Collectors.toList());
		System.out.println(numbers3);
	}
}
