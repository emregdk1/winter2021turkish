package day26_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList03 {

	public static void main(String[] args) {
		// List'in uzunlugu nasil bulunur

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		System.out.println(list);

		list.size(); // [10, 15, 8, 12, 20]
		System.out.println(list.size()); // 5

		// bir eleman nasil silinir

		list.remove(1);
		System.out.println(list); // [10, 8, 12, 20]
		System.out.println(list.remove(2)); // gir 12'yi kaldir, bize 12'yi döndürür
		// remove(index) kullandigimizda, o index'teki elemani remove eder ve bunun
		// delili olarak bize o elemani getirir, eger olmayan bir index girersek RTE
		// verir
		
		System.out.println(list); // [10, 8, 20]

		List<String> list2 = new ArrayList<>();

		list2.add("Ali");

		System.out.println(list2.remove("Hasan")); // git Hasan'i kaldir dedik bulamadigi icin false verdi
		System.out.println(list2);

		// remove(Object) method'u kullanildiginda eger Java istenen elemani bulup
		// remove ederse bize true döndürür, listede bulamazsa istegin
		// yerine getirelemedigini anlamamiz icin false döndürür

		System.out.println(list2.remove("Ali"));

	}

}
