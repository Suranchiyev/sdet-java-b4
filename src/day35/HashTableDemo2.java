package day35;

public class HashTableDemo2 {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.put("Sophia", 1);
		ht.put("Alex", 35);
		ht.put("Bob", 29);
		ht.put("James", 41);
		ht.put("Smith", 31);
		ht.put("Aslan", 36);
		ht.put("Smith", 31);
		
		ht.put("John", 14);
		ht.put("Kuzzat", 32);
		
		System.out.println(ht.get("Kuzzat"));	
		System.out.println(ht.get("Sophia"));
		System.out.println(ht.get("John"));
	}
}
