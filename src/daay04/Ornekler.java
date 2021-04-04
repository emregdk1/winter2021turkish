package daay04;

import java.util.Scanner;

public class Ornekler {

	public static void main(String[] args) {
		
		/*int num1= 10 + 5 * (25/5)- 10;
		System.out.println(num1);
		
		int num2= 5 + 5 * 10 * (10 / 5)+ 5;
		System.out.println(num2);
		
		int num3=10;
		
		double num4= num1 * num2 / num3;
		System.out.println(num4);
		
		double num5=28.8;
		double num6=12.4;
		
		double num7= num5 / num6;
		
		System.out.println(num7);
		
		double num8=25.5;
		double num9=15.2;
		
		double num10= num8 * num9;
		System.out.println(num10);
		
		
		int kalan= 26 % 16;
		System.out.println(kalan);
		
		
		int sayi=54321;
		int birlerBasamagi= sayi % 10;
		
		System.out.println("sayinin birler basagami : " + birlerBasamagi);
		
		sayi /=10;
		
		System.out.println("on'a bolundukten sonra sayinin degeri : "+ sayi);
		
		int onlarBasamagi= sayi % 10;
		
		System.out.println("sayinin onlar basamagi : "+ onlarBasamagi);
		
		sayi /=10;
		
		System.out.println("sayinin  tekrar 10'a bolumunden sonraki hali : "+ sayi);
		
		int yuzlerBasamagi= sayi % 10;
		
		System.out.println("sayinin yuzler basamagi : " + yuzlerBasamagi);
		
		sayi /=10;
		
		System.out.println("sayinin son hali : "+ sayi);
		
		int binlerBasamagi= sayi % 10;
		
		System.out.println("sayinin binler basamagi : " + binlerBasamagi);
		
		sayi /=10;
		System.out.println("sayinin son hali : " + sayi);
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("basamaklarini bulmak icin 4 haneli bir sayi giriniz");
		
		int sayi= scan.nextInt();
		
		int birlerBas= sayi % 10;
		sayi /=10;
		
		int onlarBas= sayi % 10;
		sayi /=10;
		
		int yuzlerBas= sayi % 10;
		sayi /=10;
		
		int  binlerBas= sayi %10;
		
		System.out.println("sayinin birler basamagi : " + birlerBas);
		System.out.println("sayinin onlar basamagi : " + onlarBas);
		System.out.println("sayinin yuzler basamagi : " + yuzlerBas);
		System.out.println("sayinin binler basamagi : " + binlerBas);
		
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(yuzlerBas);
		System.out.print(binlerBas);
		
		System.out.println();
		
		System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas);
		System.out.println("yazdiginiz sayilarin tersten yazilimi : " + birlerBas+onlarBas+yuzlerBas+binlerBas);
		
				


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
		

	}

}
