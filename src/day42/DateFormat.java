package day42;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String myDate = f.format(today);
		System.out.println("MM/dd/YYYY - " + myDate);
		
		DateTimeFormatter f1  = DateTimeFormatter.ofPattern("dd MMMM, YY");
		myDate = f1.format(today);
		System.out.println("dd MMMM, YY - " + myDate);
		
		// TODO come up with your format that different from above two
		// and get string representation to print.
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd MMM YYYY");
		myDate = f2.format(today);
		System.out.println("dd MM YYYY - " + myDate);
	}
}
