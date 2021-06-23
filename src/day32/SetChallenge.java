package day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetChallenge {
	public static void main(String[] args) {
		int[] inputArr = {2, 2, 1, 3, 4, 5, 4};
		
		// [2, 1, 3, 4, 5]
		System.out.println(Arrays.toString(removeDup(inputArr)));
		
		System.out.println(Arrays.toString(removeDup2(inputArr)));
		
		List<Integer> listInput = Arrays.asList(1, 2, 3, 3, 3, 4, 5, 1, 1, 2, 6);
		System.out.println(listInput);
		System.out.println(removeDup(listInput));
	}
	
	public static List<Integer> removeDup(List<Integer> listNum) {
		// 1. put into the set to remove duplicates
		Set<Integer> set = new LinkedHashSet<>(listNum);
		// 2. back to list to return it
		List<Integer> noDupList = new ArrayList<>(set);
		return noDupList;
	}
	
	public static int[] removeDup2(int[] arrNum) {
		// Set does not allow duplicates
		// put data from array to Set to remove duplicates
		Set<Integer> set = new LinkedHashSet<>();
		for (int num : arrNum) {
			set.add(num);
		}
		
		// put back to array from Set and return it
		int[] noDupArr = new int[set.size()];
		int i = 0;
		for (int num : set) {
			noDupArr[i] = num;
			i++;
		}

		return noDupArr;
	}
	
	
	public static int[] removeDup(int[] arrNum) {
		List<Integer> noDupList = new ArrayList<>();
		
		for (int num : arrNum) {
			// if noDupList does not have num add it
			if (!noDupList.contains(num)) {
				noDupList.add(num);
			}
		}
		
		// converting from list to array
		int[] noDupArr = new int[noDupList.size()];
		
		for (int i = 0; i < noDupList.size(); i++) {
			noDupArr[i] = noDupList.get(i);
		}
		
		return noDupArr;
	}
}
