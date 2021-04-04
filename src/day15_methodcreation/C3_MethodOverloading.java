package day15_methodcreation;

public class C3_MethodOverloading {

	public static void main(String[] args) {
		// Javada ayni isimle birden fazla method olusturulursa buna overloading denir
		// Overloading yapabilmek icin Method Signature'larinin farkli olmasi gerekir
		// Method Signature = isim + parametre saayisi + parametre data turu
		// Birbirini kapsayan data tipleri oldugunda, Java en optimum cozumu uretir
		// (Tamamen uyan varsa o method'u calistirir, bire bir uyan yoksa en fazla uyan
		// method'u kullanir
		// Eger kapsayan bir method da bulamazsa, Java CTE verir
		
		toplama(2.3, 5.0); 

	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("integer method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(double sayi1, double sayi2) {
		System.out.println("double method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(int sayi1, double sayi2) {
		System.out.println("integer double method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(char char1, char char2) {
		System.out.println("char method sonucu : " + (char1 + char2));
	}

	public static void toplama(String str1, String str2) {
		System.out.println("String method sonucu : " + (str1 + str2));

	}

}
