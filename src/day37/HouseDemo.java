package day37;

import java.util.Arrays;

public class HouseDemo {
	public static void main(String[] args) {
		House house = new House();
		
		house.setAddress("101 Main st");
		house.setType("Single Family");
		house.setPrice(550000);
		house.setRooms(new String[] {"guest room", "bedroom", "bedroom"});
		
		System.out.println(house.getAddress());
		System.out.println(house.getType());
		System.out.println(house.getPrice());
		System.out.println(Arrays.toString(house.getRooms()));
		System.out.println("----------");
		
		// house.rooms = null;
		String[] rCopy = house.getRooms();
		for (int i = 0; i < rCopy.length; i++) {
			rCopy[i] = null;
		}
		
		System.out.println(house.getAddress());
		System.out.println(house.getType());
		System.out.println(house.getPrice());
		System.out.println(Arrays.toString(house.getRooms()));
		System.out.println("----------");
		
	}
}
