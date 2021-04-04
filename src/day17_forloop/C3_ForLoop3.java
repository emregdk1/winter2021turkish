package day17_forloop;

import java.util.Iterator;
import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanicidan 40'dan kucuk pozitif bir tamsayi alin
		// girilen sayinin faktoriyelini hesaplayip yazdiran bir method olusturun

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen faktoriyel hesaplamak icin 40'den kucuk pozitif bir tamsayi giriniz : ");
		int sayi = scan.nextInt();

		if (sayi <= 0 || sayi >= 40) {
			System.out.println("Lutfen gecerli bir sayi giriniz");
		} else {
			faktoriyelBul(sayi); // 5
		}

	}

	public static void faktoriyelBul(int sayi) {
		long faktoriyel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*= i;
		}
		System.out.println(faktoriyel);

	}

}
