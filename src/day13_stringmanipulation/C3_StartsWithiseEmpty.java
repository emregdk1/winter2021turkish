package day13_stringmanipulation;

public class C3_StartsWithiseEmpty {

	public static void main(String[] args) {
		
		String str="Her gun Java olsa";
		
		System.out.println(str.startsWith("H")); // true
		
		System.out.println(str.startsWith("Her ")); // true
		
		System.out.println(str.startsWith("g",4)); // true
		
		System.out.println(str.startsWith("Java", 7)); // false 
		
		System.out.println(str.isEmpty()); // false
		
		String str2="";
		
		System.out.println(str2.isEmpty()); // true
		
		String str3=null; // null bir deger degildir
		
		System.out.println(str3.isEmpty()); // RTE
		
		
		
		
		
		
		
		
		

	}

}
