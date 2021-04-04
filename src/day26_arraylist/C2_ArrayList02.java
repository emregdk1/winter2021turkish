package day26_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList02 {

	public static void main(String[] args) {
		// bir ArrayList nasýl olusturulur
		// ArrayList bir objedir, dolayisiyla yeni bir tane olusturmak icin => new
		// keyword kullanmaliyiz

		// 1.yol
		ArrayList<String> list = new ArrayList<String>();

		// 2.yol
		ArrayList<String> list2 = new ArrayList<>();

		// 3.yol, en cok bu kullanilir
		List<String> list3 = new ArrayList<>();

		// NOT => eger constructor olarak List<>() kullanilirsa
		// List<>() constructor olarak kullanilamaz

		// List<String> list4=new List<>();

		// olusturdugumuz class isimleri Java'da kullanilan obje isimleriyle AYNI
		// OLMAMALIDIR

		// List'e eleman ekleme
		// List olustururken otomatik olarak eleman ekeleme ozelligi yoktur, elemanlerin
		// tek tek eklenmesi gerekir

		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");

		// List nasil yazdirilir

		System.out.println(list3); // [Ali, Veli, Ayse]

		list3.add(1, "Can");
		System.out.println(list3); // [Ali, Can, Veli, Ayse]

		list3.add(1, "Fatma");
		System.out.println(list3); // [Ali, Fatma, Can, Veli, Ayse]

		// Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari
		// yeni bir Array olarak yazdiran bir method yaziniz

		int arr[] = { 2, 3, 5, 6, 4, 3, 6, 7 };
		int sayi = 3;
		
		List<Integer> istenenList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=sayi) {
				istenenList.add(arr[i]);
			}
		}
		
		System.out.println(istenenList);
		
		
		
		
		
		
		

	}

}
