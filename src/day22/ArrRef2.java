package day22;

import java.util.Arrays;

public class ArrRef2 {
	public static void main(String[] args) {
		String[] team = {"Ramesh", "Milena", "Bek", "Sushma"};
		String[] team2 = Arrays.copyOf(team, team.length);
		
		System.out.println(Arrays.toString(team));  
		System.out.println(Arrays.toString(team2)); 
		
		team2[0] = "John";
		team2[3] = "Shiva";
		
		System.out.println(Arrays.toString(team));  //[Ramesh, Milena, Bek, Sushma]
		System.out.println(Arrays.toString(team2)); // [Ramesh, Milena, Bek, Shiva]
		
	}
}
