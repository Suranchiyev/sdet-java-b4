package day42;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDates {
	public static void main(String[] args) {
		// we are assuming that this is coming from website
		String str = "Welcome today date: July 15, 2021";
		
		// we want to make sure it will display correct today date
		
		String dateStr = str.split("date:")[1].trim();
		System.out.println("Str date: " + dateStr);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, uuuu");
		// YYYY -> uuuu
		
		LocalDate actualDate = LocalDate.parse(dateStr, f);		
		LocalDate expectedDateToday = LocalDate.now();
		
		System.out.println("Actual: " + actualDate);
		System.out.println("Expected: " + expectedDateToday);
		
		if (actualDate.equals(expectedDateToday)) {
			System.out.println("Pass");
		} else {
			System.out.println("Failed");
		}
	}
}
