package day14_methodCreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
	// Bir method'u calistirmak icin main method'un icinden cagirmak gerekir
	// Bir method'u cagirmak icin ise method adini ve parametlere uygun argument'leri
	// yazmaliyiz.
		ortalama(85.2 ,90.3); // method call		

	
	
	}

	// bir method olusturmak istedigimizde, Class'in icinde ama main method'un disinda
	// bir alanda olusturmaliyiz. Genel kullanim method'lar main method'dan sonra olur
	
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
		// Bir method'u olusturmak, o method'u calistýrmak icin yeterli degildir
		// olusturulan method, main method icinden cagirilinca calisir.
	}
	
}  // Class sonu
