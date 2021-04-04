package day10_SwitchCase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullanicidan hangi gunde oldugumuzu isteyin (Yaziyla)
		// girilen gunun haftaici veya haftasonu oldugunu yazdirin
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Lutfen hangi gunde oldugunuzu giriniz : ");
		
		String gun=scan.next().toLowerCase();
		
		switch (gun) {
		case "pazartesi" : 
		case "sali" :
		case "carsamba" :
		case "persembe" :
		case "cuma" :
			System.out.println("Hafta ici");
			break;
		case "cumartesi" :
		case "pazar" :
			System.out.println("hafta sonu");
			break;
		default :
			System.out.println("Lutfen gecerli bir gun giriniz");
			
			
		  
		
		}
		
		
		

	}

}
