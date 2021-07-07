package day37;

public class Student extends Person {
	public String course;
	public int studentId;
	
	public void printAllDetails() {
		System.out.println("-- student details --");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(course);
		System.out.println(studentId);
		System.out.println("---------------------");
	}
}
