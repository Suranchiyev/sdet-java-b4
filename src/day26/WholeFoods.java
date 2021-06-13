package day26;

public class WholeFoods {
	private Product[] products;
	
	/*
	 * Write a method that will return total price of all items
	 * product.price * product.count => total price of product
	 */
	public double getTotalPrice() {
		double sum = 0.0;
		
		for (int i = 0; i < products.length; i++) {
			sum += products[i].price * products[i].count;
		}
		
		return sum;
	}
	
	/*
	 * get sum of count in the array products
	 */
	public int getTotalNumberOfItems() {
		int prodSum = 0;
		
		for (Product prod : products) {
			prodSum += prod.count;
		}
		
		return prodSum;
	}
	
	/*
	 * Get number of products
	 */
	public int getNumberOfProducts() {
		return products.length;
	}
	
	/*
	 * It will return specific product by its name
	 * from products array
	 * if product is not there, it will return null
	 */
	public Product lookUpProduct(String name) {
		for (Product pr : products) {
			if (pr.name.equals(name)) {
				return pr;
			}
		}
		
		return null;
	}
	
	/*
	 * Return price of product based on its name
	 * if product is not in the list, return 0.0
	 */
	public double getPriceOfProduct(String name) {		
//		for (Product prod : products) {
//			if (prod.name.equals(name)) {
//				return prod.price;
//			}
//		}
		
		for (int i = 0; i < products.length; i++) {
			if (products[i].name.equals(name)) {
				return products[i].price;
			}
		}
			
		return 0.0;
	}
	
	
	public void loadProducts() {
		products = new Product[] 
				{
					new Product("Italian Bread", "dairy", 2.99, 10),
					new Product("Organic Good Seed Bread", "dairy", 5.99, 12),
					new Product("Sandwich Bread", "dairy", 2.49, 15),
					new Product("Croissant Toast", "dairy", 7.99, 20),
					new Product("Mountain White Bread", "dairy", 5.99, 11),
									
					new Product("Original Oatmilk", "beverage", 4.62, 10),
					new Product("Topochico Mineral Water", "beverage", 10.99, 8),
					new Product("Organic Orange Juice", "beverage", 11.99, 2),
					new Product("Organic Coconut Water", "beverage", 7.46, 3),
					new Product("Unsweetened Vanilla Almondmilk", "beverage", 3.39, 4),
					new Product("Lime Mineral Water", "beverage", 10.99, 5),
					new Product("Pulp Free Orange Juice", "beverage", 3.99, 8),
					
					new Product("Boneless Beef Top Loin Steak", "meat", 15.99, 2),
					new Product("Organic Chicken Breasts", "meat", 8.99, 3),
					new Product("Beef Ribeye Steak", "meat", 15.99, 4),
					new Product("Boneless Skinless Chicken Breast", "meat", 5.99, 5),
					new Product("Organic Boneless And Skinless Chicken Breasts", "meat", 7.99, 8),
					new Product("Beyond Burger", "meat", 4.04, 7),
					new Product("Ground Beef 80% Lean/ 20% Fat", "meat", 4.99, 2),
					new Product("Beef Skirt Steak", "meat", 8.09, 3),
					new Product("Organic Plain Rotisserie Chicken", "meat", 9.99, 1),
					
					new Product("Organic Honeycrisp Apple", "fruit", 3.99, 30),
					new Product("Organic Bananas", "fruit", 0.69, 40),
					new Product("Avocado", "fruit", 1.39, 19),
					new Product("Lemon", "fruit", 0.79, 20),
					new Product("Organic Peach", "fruit", 3.99, 18),
					new Product("Organic Navel Orange", "fruit", 3, 14),
					new Product("Green Seedless Grape", "fruit", 2.69, 32)			
				};		
	}
}
