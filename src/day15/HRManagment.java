package day15;

public class HRManagment {
	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		emp1.empId = 1;
//		emp1.name = "John Doe";
//		emp1.age = 25;
//		emp1.department = "IT";
//		emp1.position = Position.DEV;
//		emp1.info();
//		
//		System.out.println("=======");
//		Employee emp2 = new Employee();
//		emp2.info();
		
		Employee emp3 = new Employee("Hello");
		
		Employee emp4 = new Employee("apple", 100);
//		
		Employee emp5 = new Employee(5, "Ramesh", 39);
		System.out.println(emp5.name); // Ramesh
	}
}
