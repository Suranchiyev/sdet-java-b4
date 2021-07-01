package day36;

public class PersonDemo {
	public static void main(String[] args) {
		Person john = new Person();
		john.firstName = "John";
		john.lastName = "Doe";
		
		System.out.println(john.getFullName());
		
		Person obj = new Person();
//		obj.firstName = "Alex";
//		obj.lastName = "Rodriguez";
		// null null
		System.out.println(obj.getFullName()); 
	}
}
