package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci {

	public String bolum = "takimhane";
	public int sorOldIsciay = 20;

	public static void main(String[] args) {

		UstaBasi ub1 = new UstaBasi();
		// Objeyi torun class'inda olusturunca 3 class'a da ulasabiliyoruz

		System.out.println(ub1.bolum); // takimhane
		System.out.println(ub1.sorOldIsciay); // 20
		System.out.println(ub1.saatUcreti); // 10
		System.out.println(ub1.isim);// Mehmet

		// List<String> List = new ArrayList<>();
		// Object str = new String("Hasan");

		Isci ub2 = new UstaBasi();
		// Extends ile birbirine bagli olan class'larda IS-A relation olan
		// Data turleri istege bagli olarak kullanilabilir
		// Daha genis Data turu Yazmanin avantaji
		// Kapsamin daha genis olmasi
		// Daha genis DAta turu yazmanin dezavantaji
		// Data turu olarak sectigimiz class ve parent(larina) ait datalara ulasabiliriz

		System.out.println(ub2.departman); // Isci
		System.out.println(ub2.izindeMi); // Personel

		Personel ub3 = new UstaBasi();
		System.out.println(ub3.id); // Personel

	}

}
