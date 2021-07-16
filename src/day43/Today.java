package day43;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Today {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);	
		// LocalDateTime will work with both date and time
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalTime nowTime = LocalTime.now();	
		System.out.println(nowTime);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMM dd, uuuu, HH:mm");
		String strNow = f.format(now);
		System.out.println(strNow);
		
		// How to get date from String?
		String str = "2021-07-15";
		LocalDate dateFromStr = LocalDate.parse(str);
		System.out.println(dateFromStr.getDayOfWeek());
		System.out.println(dateFromStr);
		
		str = "July 29, 2021";
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMMM dd, uuuu");
		dateFromStr = LocalDate.parse(str, f1);
		System.out.println(dateFromStr.getDayOfWeek());
		System.out.println(dateFromStr);
	}
}
