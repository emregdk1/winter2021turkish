package day07_ifElseStatements;

import java.util.Scanner;

public class C7_ifElseif2 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise
        // sayilarin toplamini yazdirin, sayilarin ikisi de negative ise 
		// sayilarin carpimini yazdirin, sayilarin ikisi  farkli isaretlere sahipse
		// “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,  
		// sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir”  yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz : ");
		
		double sayi1=scan.nextInt();
		double sayi2=scan.nextInt();
		
		if (sayi1==0 || sayi2==0) {
			System.out.println("sifir carpmaya göre yutan elamandir");
		}
		
		else if (sayi1>0 && sayi2>0) {
			System.out.println("sayilarin toplami : " +(sayi1+sayi2));
		}
		
		else if (sayi1<0 && sayi2<0) {
			System.out.println("sayilarin carpimi : " + sayi1*sayi2);
		}
		
		else {
			System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
		}

	}

}
