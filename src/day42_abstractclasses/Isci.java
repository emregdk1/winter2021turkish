package day42_abstractclasses;

public class Isci extends Personel {
	
	public static void main(String[] args) {
		
		Isci isci1= new Isci();
		isci1.maasHesapla(); // iscilere icin maas 5000 TL
		isci1.mesaiBilgisi(); // isciler gunluk 8 saat calisir
		isci1.isim="Rumeysa"; // abstract parent class'taki variable'lari istersem kullanirim
		System.out.println(isci1.isim);  // Rumeysa 
		// System.out.println(isim);
		isci1.ozelSigorta(); // abstract parent class'taki concrete metho'u istersem kullanirim
		                     // bu personel ozel sigorta kapsamindadir
		                     // bu method'u override etmedik ama parent-child iliskisi ile kullanilabilir
		
		
		
	}

	
	public void maasHesapla() {
		// parent class'taki abstract method'u implement(uyarlama) etti
		// 1- sen abstract bir class'i parent edindiysen mutlaka oradaki abstract method'u
		//    implement etmelisin
		// 2- parent class'taki method'ta body olmadigi icin onu kullanmanin anlami yok
		//    biz child class'ta body olan method(concrete) kullanip islem yapmaliyiz
		System.out.println("iscilere icin maas 5000 TL");
		
	}

	
	public void mesaiBilgisi() {
		System.out.println("isciler gunluk 8 saat calisir");
		
		
	}

}
