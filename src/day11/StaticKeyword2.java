package day11;

public class StaticKeyword2 {
	public static void main(String[] args) {
		// static variables and method should be used by class name
		FamilyMember.money = 1000.0;
		
		FamilyMember husband = new FamilyMember();
		FamilyMember wife = new FamilyMember();
		
		husband.buyItem("book", 20);
		System.out.println("Money left: " + FamilyMember.money);
		
		wife.buyItem("dress", 200);
		System.out.println("Money left: " + FamilyMember.money);
	}
}

class FamilyMember {
	public String name;
	public static double money;
	
	public void buyItem(String itemName, double price) {
		money -= price;		
		System.out.println(name + " bought " + itemName + " for $" + price);
	}
}
