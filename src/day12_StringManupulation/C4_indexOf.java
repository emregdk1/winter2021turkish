package day12_StringManupulation;

import java.util.Scanner;

public class C4_indexOf {

	public static void main(String[] args) {
		// IndexOf() method'u bize istedigimiz karakter(lerin) indexinin dondurur.
		
		String str = "Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6)); // g
		
		System.out.println("char arama " + str.indexOf('g')); // 6
		
		System.out.println("String arama " + str.indexOf("g")); // 6
		
		System.out.println("String kelime arama " + str.indexOf("is")); // i->12 s->13 // 12
		
		System.out.println("birden fazla varsa " + str.indexOf('i')); // ilk buldugu index
		
		System.out.println("baslangic indexi ile " + str.indexOf('a', 4)); 
		// baslangic index'i inclusive
		
		System.out.println("olmayan harf " + str.indexOf("dert"));
		
		// kullanicidan bir cumle isteyin
		// case sens. olmadan Java kelimesi icerip icermedigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz : ");
		
		String cumle=scan.next().toLowerCase();
		
		// int sonuc = cumle.indexOf("java"); 
		// java varsa, ilk index'ini dondurur, java yoksa -1 dondurur
		
		//System.out.println(sonuc==-1 ? "Java icermiyor" : "Java iceriyor" );
		
		if (cumle.indexOf("java")>=0) {
			System.out.println("Cumle java iceriyor");
			
		} else {
			System.out.println("Cumle java icermiyor");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
