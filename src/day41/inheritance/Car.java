package day41.inheritance;

public class Car {
	public String name;
	public String color;
	public double price;
	
	public Car(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Car car = new Car("Audi", "black", 35000);
		
		Car car1 = new Car("Audi", "black", 35000);
		
		// .equals(Object obj) is used to compare objects
		// we can override .equals() method to give the way to compare
		// two object from our class. By default .equals method will use == oper
		
		if (car.equals(car1)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
			
	}
}
