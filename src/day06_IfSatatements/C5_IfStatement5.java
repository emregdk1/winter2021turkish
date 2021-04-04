package day06_IfSatatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// kullanicidan bir dikdörtgen iki kenar uzunlugu alin
		// kenar uzunluklari esitse "kare"
		// esit degilse "dikdörtgen" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dikdörtgenin  iki kenarini giriniz : ");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("Kare");
		}
		
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("Dikdörtgen");
			
		}
		
		if (kenar1<=0 || kenar2<=0) {
			
			System.out.println("Lutfen gecerli bir uzunluk giriniz");
		}
		
		

	}

}
