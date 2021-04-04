package day35_inheritance;

public class Personel {

	public String isim;
	public int sayi;
	
	public Personel() { // parametresiz bir cons. olusturdum
		// super();
		/*
		 Javadan yardim alarak bir cons. olusturdugumuzda,
		 Java cons'in ilk satirina super(); keyword'unu ekler
		 Eger icinde oldugumuz  class bir child class degilse, super(); keyWord silinebilir
		 Bugüne kadar biz, olusturdugumuz cons'larda hic super(); keyWord'u kullanmadik
		    ancak bizim class'larimiz child class olmadigindan sorun olmadi
		 */
		System.out.println("Personel parametresiz constructor calisti");
	}

	public Personel(String isim, int sayi) { // parametreli bir cons. olusturdum
		//super();
		System.out.println("Personel parametreli constructor calisti");
		
	}

	

	
	
	/* Eski derslerden hatirlatma
	 * her class default constructor'a sahiptir
	   Default constructor'in parametresi yoktur
	   Biz parametreli veya parametresiz bir cons. olusturdugumuzda default cons silinir
	   Eger biz sadece 1 tane parametreli cons. olusturursak, Java default olani
	     sildigi icin parametresiz cons. kalmaz
	   Dolayisiyla parametreli bir cons. olusturdugumuzda mutlaka default cons yerinede
	     parametresiz bir cons. olusturmamiz gerekir  
	  */

}
