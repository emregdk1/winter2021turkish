package day12_StringManupulation;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		// equalsIgnoreCase() method'u karsilastirdigi String'lere case sensitive
		// (buyuk kucuk harf duyarliligi) olmaksizin bakar
		// String'ler ayni ise True, ayni degilse False doner.
		
		String str1 = "Ali Can";
		String str2 = "ali CAN";
		String str3 = "Ali can ";
		
		System.out.println(str1.equals(str2)); // False 
		System.out.println(str1.equalsIgnoreCase(str2)); // True
		
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		
		
		

	}

}
