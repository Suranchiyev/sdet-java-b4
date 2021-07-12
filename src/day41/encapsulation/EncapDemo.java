package day41.encapsulation;

public class EncapDemo {
	public static void main(String[] args) {
		Person obj = new Person();
		// obj.firstName = "John";
		// obj.lastName = null;
		// obj.age = -99;
		
		obj.setFirstName("John");
		
		obj.setFirstName(null);
		obj.setFirstName("");
		// =====
		
		
		
	}
}
