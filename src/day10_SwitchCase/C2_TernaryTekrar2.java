package day10_SwitchCase;

import java.util.Scanner;

public class C2_TernaryTekrar2 {

	public static void main(String[] args) {
		// kullancidan bir sayi alin
		// sayi cift ise "cift" yazdirin
		// degilse sayinin karesini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz : ");
		int sayi=scan.nextInt();
		// eger ternary'de iki durum icin farkli data tipleri donusu oluyorsa
		// ya veriable'a atama yapmadan direkt yazdiririz
		// ya da mumkunse sonuclarý ayný data tipine cevirmeye calisiriz
		
		System.out.println(sayi%2==0 ? "cift" : sayi*sayi);
		
		scan.close();
		
		
		
		

	}

}
