package day26;

public class StoreItems {
	public static void main(String[] args) {
		Item[] items = getAllItems();
		
		// TODO print all item names	
		for (Item item : items) {
			System.out.println(item.name);
		}
		System.out.println("----- List of our dairy items -----");
		
		// TODO print item(name) from dairy category
		for (Item item: items) {
			if (item.category.equals("dairy")) {
				System.out.println(item.name);
			}
		}
		
		System.out.println("---- List of our meat and fruit items ------");	
		// TODO print item(name) from meat and fruit categories
		for (int i = 0; i < items.length; i++) {
			if (items[i].category.equals("meat") || items[i].category.equals("fruit")) {
				System.out.println(items[i].name);
			}
		}
		System.out.println("-----------------------");
		
		System.out.println("--- Items above $10 ---");
		// TODO print items(name) that has a price bigger than 10.0 from array items
		for (Item eachItem : items) {
			if (eachItem.price > 10) {
				System.out.println(eachItem.name);
			}
		}
		System.out.println("-------------------------------");
		System.out.println("----------- PRICES ------------");
		
		double totalPrice = 0.0;
		double averagePrice = 0.0;
		
		// [] [] [] [] []
		// TODO find out totalPrice and averagePrice
		
		// to find out total price
		for (Item element : items) {
			totalPrice += element.price;
		}
		
		int numberOfItems = items.length;
		averagePrice = totalPrice / numberOfItems;
		averagePrice = Math.round(averagePrice);
		
		System.out.println("Total price of all items in the store: " + totalPrice);
		System.out.println("Average price of item in out store: " + averagePrice);
		System.out.println("====================");
		
		
		double totalDairyPrice = 0;
		double totalBeveragePrice = 0;
		double totalMeatPrice = 0;
		double totalFruitPrice = 0;
		
		// TODO find out each category total price
		for (Item item : items) {
//			if (item.category.equals("dairy")) {
//				totalDairyPrice += item.price;
//			} else if (item.category.equals("beverage")) {
//				totalBeveragePrice += item.price;
//			} else if (item.category.equals("meat")) {
//				totalMeatPrice += item.price;
//			} else if (item.category.equals("fruit")) {
//				totalFruitPrice += item.price;
//			} else {
//				System.out.println("Invalid category:" + item.category);
//			}
			
			switch(item.category) {
			case "dairy":
				totalDairyPrice += item.price;
				break;
			case "beverage":
				totalBeveragePrice += item.price;
				break;
			case "meat":
				totalMeatPrice += item.price;
				break;
			case "fruit":
				totalFruitPrice += item.price;
				break;
			default:
				System.out.println("Invalid category:" + item.category);
			}		 
		}
		
		System.out.println("Total dairy category price: " + totalDairyPrice);
		System.out.println("Total beverage category price: " + totalBeveragePrice);
		System.out.println("Total meat category price: " + totalMeatPrice);
		System.out.println("Total fruit category prie: " + totalFruitPrice);
	}
	
	public static Item[] getAllItems() {
		Item[] items = 
			{
				new Item("Italian Bread", "dairy", 2.99),
				new Item("Organic Good Seed Bread", "dairy", 5.99),
				new Item("Sandwich Bread", "dairy", 2.49),
				new Item("Croissant Toast", "dairy", 7.99),
				new Item("Mountain White Bread", "dairy", 5.99),
								
				new Item("Original Oatmilk", "beverage", 4.62),
				new Item("Topochico Mineral Water", "beverage", 10.99),
				new Item("Organic Orange Juice", "beverage", 11.99),
				new Item("Organic Coconut Water", "beverage", 7.46),
				new Item("Unsweetened Vanilla Almondmilk", "beverage", 3.39),
				new Item("Lime Mineral Water", "beverage", 10.99),
				new Item("Pulp Free Orange Juice", "beverage", 3.99),
				
				new Item("Boneless Beef Top Loin Steak", "meat", 15.99),
				new Item("Organic Chicken Breasts", "meat", 8.99),
				new Item("Beef Ribeye Steak", "meat", 15.99),
				new Item("Boneless Skinless Chicken Breast", "meat", 5.99),
				new Item("Organic Boneless And Skinless Chicken Breasts", "meat", 7.99),
				new Item("Beyond Burger", "meat", 4.04),
				new Item("Ground Beef 80% Lean/ 20% Fat", "meat", 4.99),
				new Item("Beef Skirt Steak", "meat", 8.09),
				new Item("Organic Plain Rotisserie Chicken", "meat", 9.99),
				
				new Item("Organic Honeycrisp Apple", "fruit", 3.99),
				new Item("Organic Bananas", "fruit", 0.69),
				new Item("Avocado", "fruit", 1.39),
				new Item("Lemon", "fruit", 0.79),
				new Item("Organic Peach", "fruit", 3.99),
				new Item("Organic Navel Orange", "fruit", 3),
				new Item("Green Seedless Grape", "fruit", 2.69),				
			};
		
		return items;
	}
}

class Item {
	public String name;
	public String category;
	public double price;
	
	public Item() {
		
	}
	
	public Item(String name, String catergory, double price) {
		this.name = name;
		this.category = catergory;
		this.price = price;
	}
}
