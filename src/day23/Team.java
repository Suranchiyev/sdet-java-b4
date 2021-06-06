package day23;

import java.util.Arrays;

public class Team {
	public static void main(String[] args) {
		// String[][] team = new String[5][4];
		// [5] - size for outer array
		// [4] - size of inner array
	
		// [4][4]
		String[][] teams = 
			{
					{"Yulduz", "Mark", "Akylbek", "Daniel"}, 
					{"Ari", "Frank", "Nurgazy", "Anna"}, 
					{"Selvin", "Meerim", "Gulzhana", "Rocio"}, 
					{"Job", "Evelyn", "Edil", "Aizhamal"},
					{"Fawad", "Kai"}
			};
		
		// Can you print Frank?
		System.out.println(teams[1][1]); // Frank
		
		// Can you print Aizhamal?
		System.out.println(teams[3][3]); // Aizhamal
		
		// Can you print Gulzhana?
		System.out.println(teams[2][2]); // Gulzhana
		
		// Can you print Daniel?
		System.out.println(teams[0][3]); // Daniel
		
		// print each element of two dim array teams
		System.out.println("Class:");
	
		for (int i = 0; i < teams.length; i++) {
			// responsible to loop over inner arrays
			for (int j = 0; j < teams[i].length; j++) {
				System.out.println(teams[i][j]);
			}
		}
		
		System.out.println("=======");					
	}
}
