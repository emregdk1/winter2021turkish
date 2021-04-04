package day03;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		char ilkHarf= scan.next().toUpperCase().charAt(0);
		// Stringde harflerin indexleri 0'dan baslar
		// biz ilk harfi almak istedigimiz icin index olarak 0 girmeliyiz
		
		System.out.println("bas harfiniz : " + ilkHarf);
		
		// eger charAt(0) yazdiktan sonra nokta koyarsak methodlar gelmez
		// cunku charAt(0) methodu kullanalinca veriable'imizi  char yapmis oluruz
		// char primitive data tipidir ve
		// primitive data tipleri method'lara sahip degildir
		
		scan.close();
		
		

	}

}
