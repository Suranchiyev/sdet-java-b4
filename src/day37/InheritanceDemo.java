package day37;

public class InheritanceDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.firstName = "John";
		s.lastName = "Doe";
		s.age = 25;
		s.course = "Java";
		s.studentId = 987;
		
		String fullName = s.getFullName();
		System.out.println(fullName);		
		s.printAllDetails();
		
		System.out.println("========");
		Employee emp = new Employee();
	
		
	}
}
