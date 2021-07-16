package day42;

import java.time.LocalDate;
import java.time.Period;

public class PeriodPractice {
	public static void main(String[] args) {
		// Period will represent specific period of time (dates)

		LocalDate today = LocalDate.now();
		System.out.println(today);
		Period p1 = Period.of(0, 4, 7);
		today = today.plus(p1);
		System.out.println(today);
		
	}
}
