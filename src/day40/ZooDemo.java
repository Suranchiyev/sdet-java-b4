package day40;

public class ZooDemo {
	public static void main(String[] args) {
		// When we can create polymorphic objects
		// 1. When there is parent/child relation between classes
		// 2. When there is interface/concrete implementation 
		
		// interface/concrete class
		Phone obj2 = new Nokia();
		
		// parent/child		
		Primate obj = new Lemur();
		
		// Primate - reference type will decide which methods
		//           and properties is available
		
		obj.run();
		// obj.climb(); does not compile		
		// Runtime polymorphism
		
		// Type casting		
		// Auto casting
		Lemur lemur = new Lemur();	
		Primate primate = lemur;
		
		// explicit casting
		Primate primate2 = new Lemur();
		Lemur lemur2 = (Lemur)primate2;

//      Cast Exception	
//		Primate primate3 = new Primate();
//		Lemur lemur3 = (Lemur) primate3;
		
		// Break till 2:10 PM EST
		
	}
}
