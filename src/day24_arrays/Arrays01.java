package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

		int sayi = 10;
		String isim = "Ali";

		// Java'da birden fazla elemani koyabilecegimiz (store) obje'ler vardir
		// Bugün bunlardan ilkini ogrenecegiz

		int arr[] = { 10, 20, 30 }; // int[] arr seklinde de kullailabilir
									// Bu ornekte Array'in elemanlarini direkt yazdigim icin
									// uzunluk belirtmeye ihtiyac kalmadi
									// bu kullanimda max eleman sayisin (length)
									// yazdigimiz eleman sayisidir.

		System.out.println(arr); // Array bir obje'dir
									// eger direkt olarak Array'i yazdirmak isterseniz
									// Java referans'i yazdirir

		System.out.println(Arrays.toString(arr));

		String takim[] = new String[7]; // [null, null, null]
		System.out.println(Arrays.toString(takim));

		takim[0] = "Ali";
		takim[2] = "Hasan";
		takim[1] = "Veli";
		System.out.println(Arrays.toString(takim)); // [Ali, null, null]

		// takim[3]="Mehmet"; // Java Run Time programdir, dolayisiyla array programi
		// calistirinca olusturur. 35.satirda syntax olarak
		// hata olmadigindan CTE olmaz
		// program calistiginda 3.index olmadigindan RTE verir

		System.out.println(Arrays.toString(takim));

		// Array'deki bir elemani update etme
		// veli'nin yerine kemal gelsin

		takim[1] = "Kemal";
		System.out.println(Arrays.toString(takim));

		// Bir Array'in uzunlugunu nasýl bulabiliriz
		System.out.println(takim.length); // 3
											// String'deki length() idi Array'de length

		// Array'deki son elemani Mehmet yapin
		takim[takim.length - 1] = "Mehmet";
		System.out.println(Arrays.toString(takim));

		// eger array'in eleman sayisi tek ise ortadaki elemani Can yapalim

		if (takim.length % 2 == 1) {
			int ortaIndex = (takim.length - 1) / 2;
			takim[ortaIndex] = "Can";
		}
		System.out.println(Arrays.toString(takim));

	}

}
