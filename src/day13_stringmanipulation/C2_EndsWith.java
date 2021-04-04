package day13_stringmanipulation;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		// 
		/*
		String str="Java'yla hayat ne guzel";
		
		System.out.println(str.endsWith("zel"));
		
		System.out.println(str.endsWith("ne guzel"));
		
		System.out.println(str.endsWith("zel "));	
		*/	
		
		// kullanicidan bir email isteyin
		// eger @ isareti icermiyorsa "girdiginiz bilgi email degil"
		// eger @ isareti iceriyorsa ama @gmail.com icermiyorsa "lutfen gmail adresi yazin"
		// eger ilk iki sarti sagliyor ama  @gmail.com ile bitmiyorsa "gecersiz gmail adresi"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen mail adresinizi  giriniz : ");
		
		String email = scan.next();
        
        if (!email.contains("@")) { // basinda ! olunca -> email @ icermiyorsa
            
            System.out.println("girdiginiz bilgi email degil");
            
        } else if(!email.contains("@gmail.com")){ // 
            System.out.println("lutfen gmail adresi yazin");
        } else if(email.endsWith("@gmail.com")){
            System.out.println("Email'iniz basariyla kaydedildi");
            
        }else {
            System.out.println("gecersiz gmail adresi");
        }
        
        scan.close();
        }

			
		
			
				

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


