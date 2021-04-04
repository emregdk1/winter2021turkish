package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// Scanner ile kullanicidan bilgi alabiliriz
		// 3 adimla scanner islemini gerceklestiriyoruz
		
		// 1. adim Scanner objesi olusturacagiz
		Scanner scan = new Scanner(System.in);
		
		// new : Javada ne zaman new kelimesini gorseniz  yeni bir obje olusturuluyor demektir
		// parantezin icine yazilan degerlere paremetre diyoruz ve Scanner icin System.in yazmamiz gerekir
		// java.util java'nin bizim  için hazirladigi kütüphanedir,ihtiyacimiz olan kodlari class'a import etmemiz yeterlidir
		
		// 2. adim kullaniciye bir mesaj yazin
		
		System.out.println("Karenin bir kenar uzunlugunu girin");
		
		// 3. adim  kullanicinin konsola girdigi degeri programimiza alacagiz
		// ve bir variable olusturup bu degeri atayacagiz
		// kullanicidan bir kenar uzunlugu istedigim icin kullanici kücük bir sayida girebilir
		// buyuk bir sayida yazabilir, tam sayida yazabilir, virgullu sayida yazabilir
		
		
		double kenar=scan.nextDouble();
		
		System.out.println("girdiginiz kenar uzunluguna sahip karenin alani= "+kenar*kenar);
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
