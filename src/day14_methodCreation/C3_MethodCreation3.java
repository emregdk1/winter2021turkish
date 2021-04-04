package day14_methodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		// verilen 3 double sayinin ortalamasini alan bir method yazin
		// main method icinden cagirarak method'u calistirin

		ortalama(75.5, 85.2); // 2.yi calistirir ve sonucunu yazdirir
		ortalama(80,60,55); // 1.yi calistirir ve sonucunu yazdirir

	} // MM sonu

	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		System.out.println("girilen uc sayinin ortalamasini : " + (sayi1 + sayi2 + sayi3) / 3);
	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1 + sayi2) / 2);

	}
	
	

} // C sonu
