package day39;

public class Employee extends Person {
	public String name = "Alex";
	
	// Why do we need to override?
	// To give different implementation 
	// for child class
	
	@Override
	public void eat() {
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println("Lunch - eating");
	}
	
	@Override
	public void work(int i) {
		System.out.println("Employee is working");
	}
	
	@Override
	public String getName() {
		return "Alex";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee)obj;
		return this.name.equals(other.name);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "John";
		
		Employee emp2 = new Employee();
		emp2.name = "John";
		
		// == will compare when used with objects(ref) if they are pointing to the same 
		//    object or not
		
		// By default equals will compare by using ==
		if (emp.equals(emp2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
	}
}
