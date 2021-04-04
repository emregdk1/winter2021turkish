package day07_ifElseStatements;

import java.util.Scanner;

public class C4_ifElse3 {

	public static void main(String[] args) {
		// kullanicidan yasini sorun
		// 65'den buyukse "emekli olabilirsin" yoksa "emekli olamazsin"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz : ");
		
		int yas=scan.nextInt();
		
		if (yas>=65) {
			System.out.println("emekli olabilirsiniz");
		}
		
		else {
			System.out.println("emekli olamazsiniz");
		}
		
		scan.close();

	}

}
