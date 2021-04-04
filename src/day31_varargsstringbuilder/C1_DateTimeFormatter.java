package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt); // 2021-03-20T17:10:23.170645900
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy//MMMM/dd hh:mm");
		
		/*
		 yy : yilin son iki rakamini
		 yyyy : yilin tamamini
		 M : ay sirasini verir mart icin : 3
		 MM : ay sirasini verir mart icin : 03
		 MMM : ay ismini ilk uc harfi verir
		 MMMM : ay isminin tamamini verir
		 */
		
		System.out.println(dtf.format(ldt)); // 21//Mar/20 05:15
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yy/MMM/dd");
		System.out.println(dtf2.format(ldt)); // 21/Mar/20
		
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("HH:mm");
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf3.format(ldt));
		System.out.println(dtf3.format(ldt));
		
		LocalDate dogumTarihi = LocalDate.of(1996, 3, 4);
		LocalDate bugün = LocalDate.now();
		
		Period benimYasim = Period.between(dogumTarihi, bugün );
		System.out.println(benimYasim); // P-25Y-16D
		
		int yas = Period.between(dogumTarihi, bugün).getYears();
		System.out.println(yas);
		
		
		

	}

}
