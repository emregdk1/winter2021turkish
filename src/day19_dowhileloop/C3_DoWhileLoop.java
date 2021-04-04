package day19_dowhileloop;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {

		int sayi = 0;

		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen pozitif bir sayi giriniz : ");
			sayi = scan.nextInt();

		} while (sayi < 0);

		System.out.println("aferiiinn sanaaaa");
			

	}

}
