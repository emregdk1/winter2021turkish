package day02_scanner;

import java.util.Scanner;

public class C2_Scanner3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen adinizi giriniz");
		String name=scan.next();
		System.out.println("Lutfen Soyismizi giriniz");
		String surname=scan.next();
		System.out.println(name+" "+surname );
		
		
		scan.close();
		
		
		

	}

}
