package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {

		// verilen int'lardan ilki haric tum sayilari toplayin ve
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin

		toplama(2, 5);
		toplama(5, 10, 15);
		toplama(4, 5, 9, 7);
		toplama(5, 6, 8, 10, 45, 78, -12);

	}

	public static void toplama(int sayi, int... var) { // Data turunden sonra yazdigimiz ... varags kullanacagimiz
														// anlamina geliyor

		System.out.println("varargs'a dahil olmayan argument : " + sayi);
		
		int toplam=0;
		for (int each : var) {
			toplam+=each;
		}
		
		System.out.println(sayi*toplam);

	}

}
