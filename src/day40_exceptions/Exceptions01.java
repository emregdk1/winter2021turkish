package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir
		// sayi girerse Exception verecek sekilde yazin.
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz : ");
		int yas=scan.nextInt();
		
		if (yas>0) {
			System.out.println("Girdiginiz yas : " + yas);
		}
		else {
			throw new IllegalArgumentException();
			
		}
		*/
		
		// Java'ya bir exception throw ettirmek icin "throw" ve "new" keywordleri kullanilir
		
		// bu sekilde yazdigimizda Java exception throw  eder ama
		// kodumuz da bloke olur
		// Bloke olmasini engellemek isterseniz, kodu try catch ile surround yapabiliriz

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz : ");
		int yas=scan.nextInt();
		
		try {
		if (yas>0) {
			System.out.println("Girdiginiz yas : " + yas);
		
		}else {
			throw new IllegalArgumentException();
		
		}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("Kod bloke olmamiss");
	}
}
