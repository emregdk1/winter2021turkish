package day13_stringmanipulation;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		//
		String str = "Java ogren, mutlu ol, Java candir 123456";
		
		System.out.println(str.replace("Java", "hava"));
		
		// replaceAll() method'u replace() method'una benzer ama 2 farki vardir.
		// 1- replace() method'u char kabul eder ama replaceAll() kabul edemez.
		// 2- replaceAll() method'u regex kullanimina izin verir.
		
		System.out.println(str.replaceAll("\\w", "*"));
		// tum harf ve rakamlar yerine * yazacak
		
		System.out.println(str.replaceAll("\\W", "*"));
		// w'un tersi
		
		System.out.println(str.replaceAll("\\d", "."));
		// sayilari . yapar
		
		System.out.println(str.replaceAll("\\D", "."));
		// sayi olmayanlari . yapar
		
		System.out.println(str.replaceAll("\\s", "&"));
		// bosluklari & isareti ile degistirir
		
		System.out.println(str.replaceAll("\\S", "&"));
		// bosluk olmayan her seyi & isareti yapar
		
		System.out.println(str.replaceAll("\\d",""));

	}

}
