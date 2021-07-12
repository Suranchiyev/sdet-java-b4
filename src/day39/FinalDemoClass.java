package day39;

public class FinalDemoClass extends FinalClass {

// final method cannot be overridden
//	@Override
//	public void myMethod() {
//		System.out.println("Python is great!");
//	}
	
// We cannot override static methods	
//	@Override
//	public static void myStaticMethod() {
//		System.out.println("In the child static");
//	}
	
	public static void main(String[] args) {
		FinalDemoClass.myStaticMethod();
	}
}
