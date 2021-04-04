package day25_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Verilen bir String'i array'e nas�l ceviririz?
		// verilen bir cumlede kac kelime oldugunu bulunuz
		// verilen cumlede her kelimenin harfini buyuk yapiniz

		String str = "Herkes Javayi tanisa severdi";
		// bu String'i kelimelere ayiralim
		// split methodu

		String arr[] = str.split(" ");

		System.out.println(Arrays.toString(arr));

		String arr2[] = str.split("Java");
		System.out.println(Arrays.toString(arr2));

		String arr3[] = str.split("a");
		System.out.println(Arrays.toString(arr3));

		String arr4[] = str.split("");
		System.out.println(Arrays.toString(arr4));

	}

}
