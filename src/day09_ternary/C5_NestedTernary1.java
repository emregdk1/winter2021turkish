package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		// kullanicidan dikdortgen uzunlugunu ve genisligini alin
		// girilen degerlere gore dikdortgen kare olup olmadıgını yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kontrol icin dikdörtgenin kenar uzunlugunu giriniz : ");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		System.out.println(kenar1==kenar2 ? "kare" : "kare degil");
		
		String sonuc= (kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "kare" : "kare degil") : "gecersiz kenar uzunlugu");
		
		System.out.println(sonuc);
		

	}

}
