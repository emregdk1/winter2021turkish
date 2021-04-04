package day07_ifElseStatements;

import java.util.Scanner;

public class C5_ifElse4 {

	public static void main(String[] args) {
		// kullanicidan ucgenin kenar uzunluklarini alin
		// 3 kenar esitse "es kenar" yazdirin yoksa "eskenar degil" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz : ");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3 && kenar1==kenar3) {
			System.out.println("eskenar ucgen");
		}
		
		else {
			System.out.println("eskenar ucgen degil");
		}
		

	}

}
