package day12_StringManupulation;

public class C1_EqualsCiftEsittirFark� {

	public static void main(String[] args) {
		// 
		
		String str1 = "Ali Can";
		String str2 = str1 + ""; // Ali Can
		
		System.out.println(str1==str2); 
		// == hem String'e hem de adrese bakar
		// bu ornekte str1+"" yazd�g�m�zda concatenation yap�ldigi icin Java  yeni bir obje
		// olusturur ve islemin  sonucunu yeni obje'nin icine koyar. 
		// str1 ile str2'yi == ile kars�lastirirsak degerleri ayn� fakat adresleri farkl�
		// oldugu icin false doner.
		
		System.out.println(str1.equals(str2)); 
		// Equals sadece String'lerin degerlerini karsilastirir 
		// bu ornekte str1 ile str2'nin degerleri ayn� oldugu icin true dondurur.
		
		String str3 = "Ali Can";
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		

	}

}
