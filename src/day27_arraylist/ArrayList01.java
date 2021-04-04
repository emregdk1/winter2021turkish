package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		
		System.out.println(list); // [Ali, Can, Ayse, Fatma]

		System.out.println(list.size()); // 4
		
		System.out.println(list.remove(1)); // index'i 1 olan Can'i silip, bana döndürür
		System.out.println(list); // [Ali, Ayse, Fatma]
		
		System.out.println(list.remove("Ayse"));// Ayse'yi siler ve bize true döndürür
		System.out.println(list);
		
		System.out.println(list.remove("Mehmet")); // Mehmet'i bulamadigi icin false döndü
		System.out.println(list);
		
		list.remove(1);
		list.remove("Ali");
		System.out.println(list);



	}

}
