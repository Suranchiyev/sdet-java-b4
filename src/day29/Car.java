package day29;

import java.util.List;
import java.util.ArrayList;

public class Car {
	public static void main(String[] args) {
		List<String> cars = new ArrayList<>();
		cars.add("bmw");
		cars.add("audi");
		cars.add("honda");
		cars.add("tesla");
		cars.add("ford");
		
		// .size() it will return number of elements in the list
		int sizeOfList = cars.size();
		
		System.out.println("Size: " + sizeOfList);
		System.out.println(cars);
		
		cars.add("GMC");
		System.out.println(cars.size());
		
		System.out.println(cars);
		
		cars.remove(1); // remove by index
		System.out.println(cars);
		
		cars.remove("ford"); // remove by value
		System.out.println(cars);
		
		//   0     1      2     3
		// [bmw, honda, tesla, GMC]
		cars.remove(3); // remove by index. We have removed element under index 3
		
		// [bmw, honda, tesla]
		System.out.println(cars);
		
		cars.add("bmw");
		System.out.println(cars);
				
		// when duplicate value are in the list
		// remove(value) will remove first one from the left
		cars.remove("bmw");
		System.out.println(cars);
		
		List<Integer> myNumbers = new ArrayList<>();
		myNumbers.add(1);
		myNumbers.add(2);
		myNumbers.add(3);
		myNumbers.add(4);
		myNumbers.add(5);
		//  0  1  2  3  4
		// [1, 2, 3, 4, 5]
		System.out.println(myNumbers);
		
		myNumbers.remove(2);
		System.out.println(myNumbers); // [1, 2, 4, 5]
		
		//  0  1  2  3
		// [1, 2, 4, 5] -> [1, 4, 5]
		Integer val = 2;
		myNumbers.remove(val);
		System.out.println(myNumbers);
		
		System.out.println("==========");
		
		List<String> cars2 = new ArrayList<>();
		cars2.add("bmw");
		cars2.add("honda");
		cars2.add("tesla");
		cars2.add("ford");
		
		// print each value in the new line
		// TODO print each element in the new line by using for loop
		
		// get(index) - it will return single element by index
		// size()     - it will return number of elements in the list
		
		for (int i = 0; i < cars2.size(); i++) {
			System.out.println(cars2.get(i));
		}
		
		System.out.println("=======");
		
		for (String car : cars2) {
			System.out.println(car);
		}
		
	}
}



