package day12_StringManupulation;

public class C1_EqualsCiftEsittirFarký {

	public static void main(String[] args) {
		// 
		
		String str1 = "Ali Can";
		String str2 = str1 + ""; // Ali Can
		
		System.out.println(str1==str2); 
		// == hem String'e hem de adrese bakar
		// bu ornekte str1+"" yazdýgýmýzda concatenation yapýldigi icin Java  yeni bir obje
		// olusturur ve islemin  sonucunu yeni obje'nin icine koyar. 
		// str1 ile str2'yi == ile karsýlastirirsak degerleri ayný fakat adresleri farklý
		// oldugu icin false doner.
		
		System.out.println(str1.equals(str2)); 
		// Equals sadece String'lerin degerlerini karsilastirir 
		// bu ornekte str1 ile str2'nin degerleri ayný oldugu icin true dondurur.
		
		String str3 = "Ali Can";
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		

	}

}
