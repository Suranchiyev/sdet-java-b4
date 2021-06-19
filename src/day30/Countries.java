package day30;

// importing one by one considered as good practice 
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Countries {
	public static void main(String[] args) {
		// Fixed size list
		// Arrays.asList("USA", "Ukraine", "Russia", "Bolivia") 
		
		// new ArrayList<>(list); 
		List<String> countries = new ArrayList<>(Arrays.asList("USA", "Ukraine", "Russia", "Bolivia"));
		
		countries.add("Kazakhstan");
		System.out.println(countries);
		
		// TODO print each element by using Iterator 
		
		Iterator<String> iter = countries.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("=======");
		
		// TODO print each element by using forEach function 
		countries.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("=======");
		
		// remove by index
		countries.remove(1);
		System.out.println(countries);
		
		// remove by value
		boolean isDeleted = countries.remove("Russia");
		System.out.println(countries);
		System.out.println("Is deleted: " + isDeleted);
	}
}
