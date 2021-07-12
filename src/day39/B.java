package day39;

public class B extends A {
	public String str = "B";
	
	public B() {
		super(); // calling empty constructor of parent class
		// it must in the first statement
	}
	
	public void printStr() {
		System.out.println(super.str);
		System.out.println(this.str);
	}
	
	@Override
	public void printLetters() {
		super.printLetters();
		System.out.println("d");
	}
	
	public static void main(String[] args) {
		B obj = new B();
		obj.printStr();
		
		System.out.println("------");
		obj.printLetters();
		
		// 'this' refers to current object
		// 'super' refers to parent class object
		
		// Can we call a constructor of parent class
		// in the child class?
		// super() 
		// this()
		// it can be done only inside constructors
	}
}
