package day13_stringmanipulation;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve aramak istedigi  bir String isteyin
		// cumle String'i iceriyorsa "basarili" degilse "basarisiz" yazdirin
		
		Scanner scan = new Scanner(System.in);	
		/*
		System.out.println("Lutfen bir cumle giriniz : ");
		
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen aramami istediginiz String'i girin : ");
		
		String aranan= scan.nextLine().toLowerCase();
		
		cumle.contains(aranan); // bu islemin sonucu boolean, benim bunu yazi yapmam gerek
		
		System.out.println(cumle.contains(aranan) ? "Basarili" : "Basarisiz");
		*/
		
		// kullanicidan mail adresi isteyin. Mail adresi @gmail.com iceriyorsa
		// mailiniz kaydedildi yazsin, yoksa lutfen gmail adresinizi girin yazsin.
		
		System.out.println("Lutfen mail adresinizi giriniz : ");
		
		String email=scan.next();
		int sondami = email.indexOf("gmail.com", email.length()-10); // 
		// eger email gmail.com ile bitiyorsa bu islemin sonucu bir index olur (int)
		// eger email gmail.com ile bitmiyorsa -1 verir
		
		if (email.contains("gmail.com") && sondami !=-1) {
			System.out.println("mailiniz kaydedildi");
			
		} else {
			System.out.println("Lutfen gecerli gmail adresinizi giriniz");

		}
		
		// eger @gmail.com'un en sonda oldugunu kontrol etmek istersek
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
