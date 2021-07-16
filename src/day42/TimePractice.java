package day42;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimePractice {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("Time: " + now);

		LocalTime afterOneH = now.plusHours(1).plusMinutes(15).plusSeconds(200);
		System.out.println("After 1 hour: " + afterOneH);

		// 20:53
		int h = now.getHour();
		int m = now.getMinute();
		System.out.println(h + ":" + m);

		// Where do we get the date or time?
		// - we can get current(LocalDate.now(), LocalTime.now())

		LocalTime time = LocalTime.of(9, 00);

		// Formatting time
		DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm a");
		// 'a' will add time extension for 12 hours format
		String myTime = f.format(now);

		System.out.println("My time: " + myTime);
	}
}
