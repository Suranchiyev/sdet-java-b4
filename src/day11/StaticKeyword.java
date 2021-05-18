package day11;

public class StaticKeyword {
	public static void main(String[] args) {
		School obj1 = new School();
		obj1.name = "TLA";
		
		School.year = 2021;
		
		System.out.println(obj1.name); // TLA 
		System.out.println(School.year); // 2021
		
		School obj2 = new School();
		System.out.println(obj2.name); // null
		System.out.println(obj2.year); // 2021
		
		obj2.name = "PrimeSchool";
		obj2.year = 2022;
		
		System.out.println(School.year); // 2022
		System.out.println(School.year); // 2022
		
		School obj3 = new School();
		System.out.println(School.year); // 2022
		
		School obj4 = new School();
		System.out.println(School.year); // 2022
		
	}
}
