package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception04 {
	
	/*
	 
	  Eger handle edilecek exception'lar arasinda parentt-child iliskisi varsa 
	  bu durumda child exception icin catch blogu yazmasak da kodumuz calisir
	  Child exception'i silmenin
	  pozitif yani : tek catch blogu ile tum exception'lar handle edilebilir
	  negatif yani : 
	 
	 */

	public static void main(String[] args) {
		   try {
		        FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
		        int k=0;
		        try {
		            while((k=fis.read())!=-1) {
		                System.out.print((char)k);
		                fis.close();
		            }
		        } catch (FileNotFoundException  e) { 
		            
		            e.printStackTrace();
		        }
		    } catch (IOException e) {
		        
		        
		        System.out.println(e.getMessage());
		    }
		    System.out.println("");
		    System.out.println("Kod bloke olmamisss");

	}

}
