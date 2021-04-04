package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin ve Stringi tersine ceviren bir program yazin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersine cevirmek icin bir yazi giriniz : ");
		String yazi=scan.nextLine();
		
		String tersYazi="";
		
		for (int i=yazi.length()-1 ; i>=0 ; i--) {
			
			tersYazi+=yazi.charAt(i);
		}
		
		System.out.println("Girdiginiz yazinin tersten yazilisi : " + tersYazi);
		
        // 2.yol tersYazi'yi sadece yazdiracaksak veriable olusturmadan da yapabiliriz
		
		System.out.print("Girdiginiz yazinin tersi : ");
		for (int i= yazi.length()-1 ; i>=0 ; i--) {
			System.out.print(yazi.charAt(i));
		}
		
		// 3.yol method olusturup bunu yazdirabiliriz
		
		tersineCevir(yazi);
		



	}

	public static void tersineCevir(String yazi) {
		System.out.print("girdiginiz yazinin tersi meethod ile : ");
		for (int i = yazi.length()-1 ; i>=0 ; i--) {
			
			System.out.print(yazi.charAt(i));
			
		}
		
	}

}
