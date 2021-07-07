package day38;

public class Ox {
	public String name;
	public String type;
	public int age;
	
	public Ox(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Ox other = (Ox) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ox [name=" + name + ", type=" + type + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Ox obj1 = new Ox("Moo", "regular", 7);
		Ox obj2 = new Ox("Moo", "regular", 7);
		
		if (obj1.equals(obj2)) {
			System.out.println("These two objects are equal:");
			System.out.println(obj1);
			System.out.println(obj2);
		} else {
			System.out.println("These two objects are NOT equal:");
			System.out.println(obj1);
			System.out.println(obj2);
		}
	}
}
