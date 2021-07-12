package day41.encapsulation;

import java.util.ArrayList;
import java.util.List;

// TODO
// Encapsulate class Student
// - name cannot be assigned to null or empty string
// - id cannot be negative
// - grade should be in the range from 1 to 100 inclusive

public class Student {
	public String name;
	public long id;
	public List<String> courses;
	public double grade;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			// this is good place to throw an exception
			System.out.println("Invalid input");
			return;
		} 
		
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		if (id > 0) {
			this.id = id;
		} else {
			System.out.println("Invalid input");
		}
	}
	
	public List<String> getCourses() {
		// return copy, not original reference
		// because if the client side will have original ref
		// they can change it. The only legal way of changing
		// properties should be via setters.
		return new ArrayList<>(courses);
	}
	
	public void setCourse(List<String> courses) {
		this.courses = courses;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		if (grade >= 1 && grade <= 100) {
			this.grade = grade;
		} else {
			System.out.println("Invalid input");
			throw new RuntimeException("Ivalid input");
		}
	}
}
