package day09_ternary;

public class C1_Ternary1 {

	public static void main(String[] args) {
		
		int sayi=101;
		
		// Ternary islemi bir sonuc dondurdugunden bir veriable olusturup ona assing
		// etmeliyiz
		String sonuc=sayi%2==0 ? "cift sayi" : "tek sayi";
		
		System.out.println(sonuc);
		
		
		// ben bir veriable'a assing etmek istemezsem 
		// syso icine yazabilirim
		
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		
		// basina aciklama yazmak istersem
		// 
		
		System.out.println("islem sonucu : " + (sayi%2==0 ? "cift sayi" : "tek sayi"));

	
	}

}
