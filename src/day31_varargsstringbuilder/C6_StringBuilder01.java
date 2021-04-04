package day31_varargsstringbuilder;

public class C6_StringBuilder01 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder(); // Bos bir SB olusturur
		System.out.println("sb1 : " + sb1);

		StringBuilder sb2 = new StringBuilder("Mehmet"); // icinde Mehmet degeri olan bir SB üretir
		System.out.println("sb2 : " + sb2);

		StringBuilder sb3 = new StringBuilder(10); // 10 karakter kapasitesi olan bir SB üretir
		System.out.println("sb3 : " + sb3);

		sb1.append(" Hoca");
		System.out.println("sb1 append : " + sb1); // sb1 append : Hoca

		sb2.append(" Hoca");
		System.out.println("sb2 append : " + sb2); // sb2 append : Mehmet Hoca

		sb3.append(" Hoca");
		System.out.println("sb3 append : " + sb3); // sb3 append : Hoca

		System.out.println("sb1 uzunluk : " + sb1.length()); // 5 " Hoca"
		System.out.println("sb1 kapasite : " + sb1.capacity()); // 16 bir deger yazmadigimiz icin default kapasite 16 oldu
																

		System.out.println("sb2 uzunluk : " + sb2.length()); // 11 Mehmet Hoca
		System.out.println("sb2 kapasite : " + sb2.capacity()); // 22 

		System.out.println("sb3 uzunluk : " + sb3.length()); // 5 " Hoca"
		System.out.println("sb3 kapasite : " + sb3.capacity()); // 10 basta 10 kapasite verdigimiz icin dolana kadar kullaniyor
		
		// kapasite hafiza yonetimi icin con onemli

	}

}
