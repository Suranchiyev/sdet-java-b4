package day12;

public class StrReplace {
	public static void main(String[] args) {
		// replace(oldValue, newValue);
		// it will replace all old value to new values
		
		String city = "Almata-Ata"; // Almata Ata
		System.out.println(city);
		System.out.println(city.replace("-", " "));
		// System.out.println(city);
		city = city.replace("-", " ");
		
		String str = "Updates=are=available=for=you";
		str = str.replace("=", "$");
		System.out.println(str);
		
		String word = "Hello, Friends!";
		System.out.println(word);
		word = word.replace("Hello", "Aloha");
		System.out.println(word);
	}
}
