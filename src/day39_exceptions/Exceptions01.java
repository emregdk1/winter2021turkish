package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		// Java'ya bir dosyayi okumasini veya dosyaya yazmasini soyledigimizde
		// Java "Ya dosyayi bulamazsa" der ve bizden cozum uretmemizi bekler
		// dosya bulma ile ilgili exception turu : FileNotFoundException
		// JAva kodu yazar yazmaz, burdadaki olasi problemi gorur ve CTE verir
		// Kodumuzu yazdigimiz anda ortaya cikan bu tur exception'lara Checked Exp diyoruz
		

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\EMre\\eclipse-workspace\\winter2021turkish\\src1\\day39_exceptions\\file");
		} catch (FileNotFoundException e) {

			//e.printStackTrace(); // tum hata aciklamalarini yazdirir ama kodumuz
			                     // bloke olmaz
			System.out.println(e.getMessage());
		}
		System.out.println("Kod bloke olmamissssssss");

	}

}
