package day06_IfSatatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		
		// kullanicidan gun isminin ilk harfini isteyin
		// ve harfe uygun olan gun isimlerini yazdirin
		// c --> cuma,cumartesi
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun isminin ilk harfini giriniz : ");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		// bu satir itibariyla girilen String'in ilk karakterini almis oldum
		
		// p,s,c,
		
		if (ilkHarf=='p' || ilkHarf=='P') {
			System.out.println("pazar,pazartesi veya persembe");
		}
		
		if (ilkHarf=='s' || ilkHarf=='S') {
			System.out.println("sali");
		}
		
		if (ilkHarf=='c' || ilkHarf=='C') {
			System.out.println("carsamba,cuma veya cumartesi");
		}
		
		if (ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='s' && ilkHarf!='S' && ilkHarf!='c' && ilkHarf!='C') {
			System.out.println("Lutfen gecerli bir harf giriniz");	
		}
		
		scan.close();
			
		
		
		
		
		
		
		
	

	}

}
