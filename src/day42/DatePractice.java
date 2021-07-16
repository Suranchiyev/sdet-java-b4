package day42;

import java.time.LocalDate;

public class DatePractice {
	public static void main(String[] args) {
		// Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today);
		
		LocalDate birthday = LocalDate.of(1996, 03, 26);
		
		System.out.println("Birthday: " + birthday);
		
		System.out.println("Day of week: " + birthday.getDayOfWeek());
		System.out.println("Was it leap year: " + birthday.isLeapYear());
		
		System.out.println("ERA: " + birthday.getEra());
		
		LocalDate afterThreeMonths = birthday.plusMonths(3);
		System.out.println("After three months: " + afterThreeMonths);
		System.out.println("Day of week: " + afterThreeMonths.getDayOfWeek());
		
		afterThreeMonths = afterThreeMonths.plusWeeks(2);
		System.out.println("Plus two weeks: " + afterThreeMonths);
		
		afterThreeMonths = afterThreeMonths.minusWeeks(14);
		System.out.println("Minus 14 weeks: " + afterThreeMonths);
		
		LocalDate now = LocalDate.now();
		LocalDate someDate = LocalDate.of(2026, 05, 05);
		
		System.out.println(now.isAfter(someDate));
	}
}
