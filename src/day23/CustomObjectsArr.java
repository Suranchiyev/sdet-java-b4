package day23;

public class CustomObjectsArr {
	public static void main(String[] args) {
		// [{id=1, name="Alex"}, {id=2, name="John"}, {id=3, name="Bob"}, {id=4,}]
		Student[] myArr = new Student[4];
		
		Student s1 = new Student(1, "Alex");
		myArr[0] = s1;
		
		myArr[1] = new Student(2, "John");
		myArr[2] = new Student(3, "Bob");
		myArr[3] = new Student(4, "Vlad");
		
		for(Student element : myArr) {
			System.out.println("Details: " + element.id + ", " + element.name);
		}	
	}
}

class Student {
	public long id;
	public String name;
	
	public Student(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student() {
		
	}
}
