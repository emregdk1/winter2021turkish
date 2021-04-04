package day06_IfSatatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		
		// kullanicidan gun ismini isteyin
		// girilen gunun haftaici veya haftasonu  oldugunu yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen gun adini giriniz : ");
		
		String gunAdi= scan.next().toLowerCase();
		
		// Eger String'lerde esitlik sorguluyorsak == kullanmamaliyiz
		// String'lerde esit olma durumunu sorgulamak icin equal()
		
		if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
			System.out.println("Haftasonu");
		
		}
		
		if (gunAdi.equals("pazartesi") || gunAdi.equals("sali") || gunAdi.equals("carsamba") || gunAdi.equals("persembe") || gunAdi.equals("cuma")) {
			System.out.println("Haftaici");
			
	}
		scan.close();
	

	}

}
