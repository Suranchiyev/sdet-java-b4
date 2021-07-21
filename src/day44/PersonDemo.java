package day44;

public class PersonDemo {
	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.setName("John Doe");
		obj.setAge(20);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println("-----");
		
		Person obj2 = new Person();
		obj2.setName("Ramesh Kenary");
		obj2.setAge(42);
		
		System.out.println(obj2.getName());
		System.out.println(obj2.getAge());
	}
}
