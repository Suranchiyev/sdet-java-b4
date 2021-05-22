package day14;

public class WarmUp {
	public static void main(String[] args) {
		Student s1 = new Student("A");
		Student s2 = new Student("B");
		Student s3 = new Student("C");
		
		s2 = s1;
		s3 = s1;
		
		// What's Garbage Collection in Java?
		// GC is mechanism in Java to clean up unused objects. 
		// Object will become unused when it does not have references
		
		// Which objects are eligible for GC after line 10?
		
		// How to start GC in Java?
		// We cannot force GC to clean up, it's automatic process
		// but we can suggest.

	}
}

class Student {
	public String name;
	
	public Student(String name) {
		this.name = name;
	}
}
