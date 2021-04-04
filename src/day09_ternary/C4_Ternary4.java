package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz : ");
		
		int sayi=scan.nextInt();
		
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		
		// girilen sayinin mutlak degerini bulunuz
		
		System.out.println("Sayinin mutlak degeri : " + (sayi>0 ? sayi : -sayi));

	}

}
