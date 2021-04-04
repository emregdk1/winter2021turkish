package day28_foreachloop;

public class C1_ForEachLoop1 {

	public static void main(String[] args) {
		// bir array'i tum elemanlarini for loop ile yazdiralim

		int arr[] = { 2, 4, 6, 8, 10 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// for loop yazmamizin amaci, array'in TUM ELEMANLARI uzerinde islem yapmak ise,
		// foreach loop daha kolay kod yazmamizi saglar
		
		// each => her bir demek
	    // for each loop istedigim bir topluluktaki tum elemanlari birer birer getirir
		// for each loop'da baslangic degeri YOKTUR, bitis degeri de YOKTUR, index YOKTUR
		System.out.println();
		
		for (int w : arr) {
			System.out.print(w + " ");
		}

	}

}
