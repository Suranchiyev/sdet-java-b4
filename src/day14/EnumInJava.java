package day14;

public class EnumInJava {
	enum Course {JAVA, SELENIUM, API, SQL};
	
	public static void main(String[] args) {
		Course myCourse = Course.JAVA;
		System.out.println(myCourse);
		
		String strCourse = "Apple";
		System.out.println(strCourse);
		System.out.println("=======");
			
		printDurationOfCourse("Java");
		printDurationOfCourse("API");
		printDurationOfCourse("Python");
		
		printDurationOfCourse2(Course.JAVA);
		printDurationOfCourse2(Course.API);
		//printDurationOfCourse2(Course.Python);
	}
	
	public static void printDurationOfCourse2(Course course) {
		if (course.equals(Course.JAVA)) {
			System.out.println("3 months");
			
		} else if (course.equals(Course.SELENIUM)) {
			System.out.println("2.5 months");
			
		} else if (course.equals(Course.API)) {
			System.out.println("1 month");
			
		} else if (course.equals(Course.SQL)) {
			System.out.println("2 weeks");
			
		} else {
			System.out.println("Undefined course");		
		}
	}
	
	/*
	 * JAVA - 3 months
	 * SELENIUM - 2.5 months
	 * API - 1 month
	 * SQL - 2 weeks
	 */
	public static void printDurationOfCourse(String course) {
		if (course.equalsIgnoreCase("JAVA")) {
			System.out.println("3 months");
		} else if (course.equalsIgnoreCase("SELENIUM")) {
			System.out.println("2.5 months");
		} else if (course.equalsIgnoreCase("API")) {
			System.out.println("1 month");
		} else if (course.equalsIgnoreCase("SQL")) {
			System.out.println("2 weeks");
		} else {
			System.out.println("Undefined course");
		}
	}
}







