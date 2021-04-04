package day07_ifElseStatements;

import java.util.Scanner;

public class C8_ifElse3 {

	public static void main(String[] args) {
		// Kullanicidan maas icin bir teklif isteyin ve
		// asagidaki degerlere gore cevap yazdirin. Teklif 80.000’in uzerinde ise
		// “Kabul ediyorum” , 60 – 80.000 arasinda ise  “Konusabiliriz”
		//  60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen maas icin bir teklif giriniz : ");
		
		double maas=scan.nextDouble();
		
		if (maas>80000) {
			System.out.println("kabul ediyorum");
		}
		
		else if (maas>60000 && maas<=80000) {
			System.out.println("konusabiliriz");
		}
		
		else {
			System.out.println("maalesef kabul edemem");
		}
		
		

	}

}
