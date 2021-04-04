package day25_arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// iki array'in esit oldugunu kontrol etme
		int arr1[] = { 10, 25, 5, 20 };
		int arr2[] = { 25, 10, 20, 5 };

		Arrays.equals(arr1, arr2);
		System.out.println(Arrays.equals(arr1, arr2));

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println(Arrays.equals(arr1, arr2));

		// iki array'in birbirine esit olmasi icin hem uzunluklari, icindeki tum
		// elemanlar, ve esit elemanlarin index'leri esit olmalidir

	}

}
