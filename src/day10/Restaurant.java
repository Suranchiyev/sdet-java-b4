package day10;

public class Restaurant {
	public static void main(String[] args) {
		// properties of object will have 
		// default values
		// Object = null
		// numeric = 0
		// boolean = false
		
		Table t1 = new Table();
		t1.color = "black";
		t1.type = "desk";
		t1.isReserved = true;
		
//		System.out.println(t1.color);
//		System.out.println(t1.type);
//		System.out.println(t1.isReserved);
		t1.displayDetails();
		
		System.out.println("------");
		Table t2 = new Table("white", "kitchen", false);
		t2.displayDetails();
		
		System.out.println("------");
		Table t3 = new Table("yellow", "kitchen", true);
		t3.displayDetails();
	}
}
