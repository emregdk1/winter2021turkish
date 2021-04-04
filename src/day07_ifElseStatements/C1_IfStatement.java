package day07_ifElseStatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// kullanicidan bir tamsayi isteyin
		// sayi pozitif ise "sayi pozitif" yazdirin
		// sayi 100'den kucukse "kucuk sayi" yazdirin
		// sayi 1000'den buyukse "buyuk sayi" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz : ");
		
		int sayi= scan.nextInt();
		
		if (sayi>0) {
			
			System.out.println("sayiniz pozitif bir tam sayidir");
		}
		
		if (sayi<100) {
			System.out.println("kucuk sayi");
		}
		
		if (sayi>1000) {
			System.out.println("buyuk sayi");
			
		}
		
		
		

	}

}
