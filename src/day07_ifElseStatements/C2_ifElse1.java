package day07_ifElseStatements;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		// kullanicidan kenar uzunluklarini alin
		// uzunluklar esit ise "kare", degilse kare degil yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kenar uzunluklari giriniz : ");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			
			System.out.println("kare");
		}
		
		else {
			System.out.println("kare degil");
		}
		scan.close();
		

	}

}
