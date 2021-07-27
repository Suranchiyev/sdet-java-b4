package day49;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project {
	enum Player {X, O};
	
	public static void main(String[] args) {
		
		String[][] map = 
			{
					{"1", "2", "3"},
					{"4", "5", "6"},
					{"7", "8", "9"}
			};
		
		printMap(map);
		
		while(true) {
			
			System.out.println("X: please choose your cell based on number:");
			int xLocation = getLocation(map);
			changeMap(map, xLocation, Player.X);
			if(isDraw(map)) {
				System.out.println("Draw!");
				break;
			}
			
			printMap(map);
			if(didIWin(map, Player.X)) {
				System.out.println("X Winn!");
				break;
			}
			
			System.out.println("O: please choose your cell based on number:");
			int oLocation = getLocation(map);
			changeMap(map, oLocation, Player.O);
			
			if(isDraw(map)) {
				System.out.println("Draw!");
				break;
			}
			
			printMap(map);
			if(didIWin(map, Player.O)) {
				System.out.println("O Winn!");
				break;
			}
		}
	}
	
	public static boolean isDraw(String[][] map) {
		return availableLocations(map).size() == 0;
	}
	
	// The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row is the winner.
	// for example:
	// if Map looks like this
	// Map:
	// X | X | X 
	// 4 | 5 | 6 
	// O | O | 9 
	// Then X player won. We can check this condition as
	// map[0][0] == Player.X && map[0][1] == Player.X && map[0][2] == Player.X 
	// Instead if hard coded Player.X we need to use playerEnum
	// Please write all possible winning solutions
	// Player playerEnum argument will represent player and it will be
	// Player.X or Player.O
	public static boolean didIWin(String[][] map, Player playerEnum) {
		String player = playerEnum.toString();
		
		if (map[0][0].equals(player) && map[0][1].equals(player) && map[0][2].equals(player)) {
			return true;
		} else if (map[1][0].equals(player) && map[1][1].equals(player) && map[1][2].equals(player)) {
			return true;
		} else if (map[2][0].equals(player) && map[2][1].equals(player) && map[2][2].equals(player)) {
			return true;
		} else if (map[0][0].equals(player) && map[1][0].equals(player) && map[2][0].equals(player)) {
			return true;
		} else if (map[0][1].equals(player) && map[1][1].equals(player) && map[2][1].equals(player)) {
			return true;
		} else if (map[0][2].equals(player) && map[1][2].equals(player) && map[2][2].equals(player)) {
			return true;
		} else if (map[0][0].equals(player) && map[1][1].equals(player)  && map[2][2].equals(player)) {
			return true;
		} else if (map[0][2].equals(player) && map[1][1].equals(player)  && map[2][0].equals(player)) {
			return true;
		}
		
        return false;
	}
	
	public static boolean changeMap(String[][] map, int location, Player player) {
		switch(location) {
		case 1:
			map[0][0] = player.toString();
			return true;
		case 2:
			map[0][1] = player.toString();
			return true;
		case 3:
			map[0][2] = player.toString();
			return true;
		case 4:
			map[1][0] = player.toString();
			return true;
		case 5:
			map[1][1] = player.toString();
			return true;
		case 6:
			map[1][2] = player.toString();
			return true;
		case 7:
			map[2][0] = player.toString();
			return true;
		case 8:
			map[2][1] = player.toString();
			return true;
		case 9:
			map[2][2] = player.toString();
			return true;
		default:
			return false;
		}
	}
	
	public static void printMap(String[][] map) {
		System.out.println("------------");
		System.out.println("Map:");
		for(String[] row : map) {
			String cells = "";
			for(String cell : row) {
				cells += cell + " | ";
			}
			System.out.println(cells.substring(0, cells.length() - 2));
		}
		System.out.println("------------");
	}
	
	public static int getLocation(String[][] map) {
		Scanner scanner = new Scanner(System.in);
		int location;
		do {
			location = scanner.nextInt();
		} while (!isValidLocation(location, availableLocations(map)));
		
		return location;
	}
	
	/*
	 * location is valid if location is more than 0 and location is less than 10 and if location is part of the available locations
	 */
	public static boolean isValidLocation(int location, List<Integer> availableLocations) {
		if (location > 0 && location < 10) {
			return availableLocations.contains(location);
		}
		
        return false;
	}
	
	// if cell value is not X or O it's available.
    // return list of all available locations from map two dimensional array
	public static List<Integer> availableLocations(String[][] map) {
		List<Integer> list = new ArrayList<>();
		
		for (String[] innerMap : map) {
			for (String l : innerMap) {
				if (!(l.equals("X") || l.equals("O"))) {
					list.add(Integer.parseInt(l));
				}
			}
		}
		
		return list;
	}
}
