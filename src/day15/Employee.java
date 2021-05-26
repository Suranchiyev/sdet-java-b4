package day15;

public class Employee {	
	public long empId;
	public String name;
	public int age;
	public String department;
	public Position position;
	
	public void info() {
		System.out.println("Emp id: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Dep: " + department);
		System.out.println("Position: " + position);
	}
	
	// constructor - special method to initialize/create an object
	// - when we create our object, we are calling constructor
	// - it has same name as class name
	// - by default java will provide empty constructor
	// - we can have multiple constructors with diff arguments
	
	public Employee() {
		System.out.println("Inside empty constructor");
	}
	
	public Employee(String str) {
		System.out.println("Inside one arg constructor");
		System.out.println(str);
	}
	
	public Employee(String str, int num) {
		System.out.println("Inside two args constructor");
		System.out.println(str + ", " + num);
	}
	
	public Employee(long empId, String name, int age) {
		this.empId = empId;
		this.name = name;
		this.age = age;
	}
}












