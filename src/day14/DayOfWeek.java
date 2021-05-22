package day14;

public class DayOfWeek {
	enum Day {Mon, Tue, Wed, Thur, Fri, Sat, Sun};
	
	public static void main(String[] args) {		
		printDayMsg(Day.Mon); // Home work day!
		printDayMsg(Day.Tue); // Study day!
		printDayMsg(Day.Wed); // Chill day!
		printDayMsg(Day.Sun); // Java epic day!
		printDayMsg(Day.Thur); // Study day!
	}
	
	/*
	 * Mon - Home work day!
	 * Tue - Study day!
	 * Wed - Chill day!
	 * Thur - Study day!
	 * Fri - Coding day!
	 * Sat, Sun - Java epic day!
	 */
	public static void printDayMsg(Day day) {
		switch (day) {
		case Mon: 
			System.out.println("Home work day!");
			break;
		case Tue:
		case Thur:	
			System.out.println("Study day!");
			break;
		case Wed:
			System.out.println("Chill day!");
			break;
		case Fri:
			System.out.println("Coding day!");
			break;
		case Sat:
		case Sun:
			System.out.println("Java epic day!");
		}
	}
	
	
}
