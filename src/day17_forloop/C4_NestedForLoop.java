package day17_forloop;

import java.util.Scanner;

public class C4_NestedForLoop {

	public static void main(String[] args) {
		/*
		 * Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
		 * asagidaki sekli cizdirin
		 *
		 * * 
		 * * *
		 * * * *
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 10'dan kucuk pozitif bir tam sayi giriniz : ");
		int sayi=scan.nextInt();
		
		
		for (int i = 0; i<=sayi; i++) {
			System.out.println(" ");
			for (int j = 0; j<i; j++) {
				System.out.print("* ");
			}
		}

	}

}
