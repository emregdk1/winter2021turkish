package day22_constructor;

public class CarUret {
	// su anda bu class'da gorunur bi constructor yok
	// bir class olusturuldugunda Java bu class'dan obje uretilecegini bilir
	// ve gorunmeyen DEFAULT CONSTRUCTOR'i class'a yerlestirir
	// default constructor parametresizdir, dolayisiyla sadece hicbir ozelilligi
	// tanýmlanamayan objeler uretir.(týsort uret demek gibidir)
	// default constructor ile uretileen bir objenin tum ozellikleri sonradan
	// tanimlanmalidir

	// eger biz sonradan bir constructor yazarsak, Java default constructor'i iptal
	// eder

	// Bir constructor olusturalim

	public CarUret() {

	}

	// kurallar 1-ismi class ile ayni olmalidir(dolayisiyla buyuk harfle baslar)
	// 2-Constructor return type'a sahip degildir
	// 3-Constructor isminden sonra mutlaka parantez olur () ama paramatre olmasi
	// opsiyoneldir
	// 4-bir constructor olusturuldugunda kimlerin kullanacagini belirlemek icin
	// access modifier yazmaliyiz

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	// bir programda cok fazla uretecegimiz objeler icin, bir tane class olustururuz
	// bu class'da olusturulacak objelere ait tum ozellikler olur
	// bu class direkt calistirilmayacagi icin main method olmasa da olur

	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanilir");
	}

	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}

}
