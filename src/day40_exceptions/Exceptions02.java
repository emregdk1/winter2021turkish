package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");

		// try-catch blogu exception ile handle etmek kullanilir
		// throws keyword'u ise sadece declaration
		// throws kullanilan bir method'ta exception olursa KOD BLOKE olur
		
		int k=0;
        
            while((k=fis.read())!=-1) {
                System.out.print((char)k);
            }
            
            // Eger birden fazla exception icin throws keyword'u kullanacaksak
            // yazacagimiz exception'larin arasindaki iliski ve siralama onemli olur
            // Eger yazdigimiz exception'lar arasinda parent-child iliskisi varsa
            // once child exception yazilmalidir, aksi takdirde child

	}

}
