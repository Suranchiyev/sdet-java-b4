package day26;

public class GroceryShopping {
	public static void main(String[] args) {
		WholeFoods store = new WholeFoods();
		store.loadProducts();
		
		int numOfPr = store.getNumberOfProducts();
		System.out.println("Number of products: " + numOfPr);
		
		Product myProduct = store.lookUpProduct("Avocado");
		//                    null.name
		System.out.println(myProduct.name); // Avocado
		System.out.println(myProduct.price); // 1.39
		
		Product myProduct2 = store.lookUpProduct("Lemon");
		System.out.println(myProduct2.name);
		System.out.println(myProduct2.price);
		System.out.println(myProduct2.count);
		System.out.println("==========");
		
		System.out.println(store.getPriceOfProduct("Sandwich Bread")); // 2.49
		System.out.println(store.getPriceOfProduct("Lemon")); // 0.79
		System.out.println(store.getPriceOfProduct("Avocado")); // 1.39
	
		System.out.println("==========");
		System.out.println(store.getTotalNumberOfItems()); // 316
	
		System.out.println("==========");
		System.out.println(store.getTotalPrice()); // 1324.4399999999998
	}
}
