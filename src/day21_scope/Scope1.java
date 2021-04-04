package day21_scope;

public class Scope1 {

	static int okulId = 1201;
	static String okulAdi = "Yildiz Koleji";
	static boolean acikMi;
	
	// -static variable'lar class level'da olusturuldugu icin class'in her yerinde kullanilir
	// -instance variable'lar static olmayan method'larda direkt kullanilabiliyorken
	// static method'larda obje olusturularak kullanýlabiliyordu
	// -static variable'lar ise ister static isterse static olmayan tum method'lardan
	// direkt kullanilabilir.

	public static void main(String[] args) {
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi);
		okulId=1202;
		acikMi=true;
		
		staticMethod();
	
	}

	public static void staticMethod() {

		System.out.println(okulId + " " + okulAdi + " " + acikMi);
		okulId=1203;
		
	}

	public void method() {
        okulId=1205;
	}

}
