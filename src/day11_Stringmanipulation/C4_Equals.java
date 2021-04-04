package day11_Stringmanipulation;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2'yi karsilastirir ve String olarak 
		// esit olup olmadiklarina bakar. sonuc olarak true veya false'a dondurur(sonuc)
		
		// bazi methodlarin yaptiklari islem ile dondurdukleri sonuc farkli olabilir
		// bir methoda git ali ismindeki elementi sil deriz,
		// o da gidip ali'yi bulur ve siler
		
		String str="Ali Can";
		String str2="Ali Can";
		
		// str ile str2'nin esit olup olmadýgýný yazdirin
		
		System.out.println(str.equals(str2)); // True
		
		System.out.println(str.equals(str2) ? "Esit" : "Esit degil");
		
		// Java'da String'ler case sensitive'dir.(buyuk kucuk harf duyarlidir.
		// bir harf bile farkli olsa String'ler esit olmaz)
		

	}

}
