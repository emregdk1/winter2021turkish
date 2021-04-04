package day03;

import java.util.Scanner;

public class C1_Scanner1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sadece isminizi giriniz");
		String name = scan.next();
		System.out.println("Lutfen sadece soyadinizi giriniz");
		String surname = scan.next();
		
		System.out.println("Isminiz : "+ name);
		System.out.println("Soyisminiz :"+ surname);
		System.out.println("Kursumuza kaydiniz alinmistir,tesekkur ederiz");
		
		scan.close();
	}

}
