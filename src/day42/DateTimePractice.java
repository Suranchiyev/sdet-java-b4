package day42;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimePractice {
	public static void main(String[] args) {
		// LocalDate - works with dates
		// LocalTime - works with times
		// LocalDateTime - works with date and time
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YY, hh:mm a");
		String myDateTime = f.format(now);
		System.out.println(myDateTime);
		
		//  LocalDateTime.now() - current date and time
		LocalDate july30 = LocalDate.of(2021, Month.JULY, 30);
		LocalTime time1 = LocalTime.of(6, 10);
		LocalDateTime date1 = LocalDateTime.of(july30, time1);
		
		LocalDateTime date2 = LocalDateTime.of(2021, 7, 30, 6, 11);
		
		if (date1.equals(date2)) {
			System.out.println("these dates are same");
		} else {
			System.out.println("these dates are NOT same");
		}
	}
}
