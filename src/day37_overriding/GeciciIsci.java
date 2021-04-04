package day37_overriding;

public class GeciciIsci extends Isci {

	public String calistigiBolum = "Yemekhane";

	public static void main(String[] args) {

		// Overriding (gecersiz kilma)
		// bir child class'ta parent class'tan miras alinan method'u
		// degistirmeye overriding denir

		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();

	}

	// overriding yapmak icin parent class'taki method signature'i
	// ile child class'ta bir method olusturulur
	// signature ayni oldugundan sadece body degisir
	// boylece parent class'taki method chils class icin gecersiz hale gelir

	public int maasHesapla() {

		return 30 * 8 * 10;
	}

	@Override // annotation
	public void mesai() {
		// super.mesai();
		System.out.println("Gecici isciler haftada 25 saat calisir");
	}

	// annotation : aciklama, dipnot
	// Java 28.satirda kodu inceleyenler icin bir aciklama getiriyor

	// annotation olmasi ile olmamasi arasindaki fark
	// annotation sadece bir aciklama degildir
	// override yaptigimiz method'u sürekli kontrol eder ve parent class'taki
	// overridden method signature'i degistirilirse, CTR verdirir

	// Eger override edilen parent class'taki method(overriden)'un da
	// calismasini istiyorsak overriding method'un ilk satirina
	// super() overridenMethodIsmi yazariz
	// eger overriding method'ta super. yazilmazsa
	// overriden method calismaz

	// Acces Modifier
	// Child Parent'i sýnýrlandiramaz
	// Yani overriding method'un acces modifier'i overridden method'un acces
	// modifier'indan
	// daha dar olamaz

	// Return Type
	// overriden method'un return type'i primitive ise overriding method'un return
	// type'i da ayni olmali
	// eger return type primitive degilse
	// (overridden method'un return type'i) IS-A (overridden method'un return type'i) olmalidir
	
	
	
	
	
	
	
	
	
	

}
