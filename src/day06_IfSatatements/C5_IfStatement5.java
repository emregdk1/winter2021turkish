package day06_IfSatatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// kullanicidan bir dikd�rtgen iki kenar uzunlugu alin
		// kenar uzunluklari esitse "kare"
		// esit degilse "dikd�rtgen" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dikd�rtgenin  iki kenarini giriniz : ");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("Kare");
		}
		
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("Dikd�rtgen");
			
		}
		
		if (kenar1<=0 || kenar2<=0) {
			
			System.out.println("Lutfen gecerli bir uzunluk giriniz");
		}
		
		

	}

}
