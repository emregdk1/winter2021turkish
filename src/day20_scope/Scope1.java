package day20_scope;

import java.util.Scanner;

public class Scope1 {

	public int sayi; // class'in icinde fakat main method'un disinda olusturalan
				// ve static olmayan variable'lara INSTANCE (Object) variable denir
				// class leval'da olusturuldugu icin class'in her yerinden belli sartlarda
				// kullabilabilir
				// instance variable'lar object'e bagli olarak calisir (ogretmen adi gibi)
	public String isim = "Emre";
	public String soyisim;
	boolean izindeMi; // default deger- false
	char ilkHarf; // default deger- bosluk

	public static void main(String[] args) {

		// System.out.println(sayi);// static olmayan bir variable'a static method
		// icinden
		// ulasamayiz
		// main method'umuz static oldugu icin main method
		// icerisinden static olmayan variable veya method'lara
		// direkt ulasamayiz.

		// instance bir variable'e main method icerinden ulasmak istedigimizde
		// OBJECT olusturmaliyiz

		Scanner scan = new Scanner(System.in); // bu Javadaki standart obje olusturma formudur
		// class ismi / obje ismi / obje olusturma keyword /  class ismi

		Scope1 obj1 = new Scope1();
		System.out.println(obj1.sayi); // buna deger atamadýk, Java default deger verdi- 0
		System.out.println(obj1.isim);
		System.out.println(obj1.soyisim); // buna deger atamadýk, default deger- null
		// instance variable'lar olusturuldugunda, biz istersek deger atayabiliriz
		// instance variable'lara eger biz deger atamazsak, Java DEFAULT deger atar

		Scope1 obj2 = new Scope1();
		obj2.isim = "Muslum";
		obj2.soyisim = "Baba";

		System.out.println(obj2.isim + " " + obj2.soyisim); // Muslum Baba
		System.out.println(obj1.isim + " " + obj1.soyisim); // Emre null

		System.out.println(obj2.izindeMi); // false
		System.out.println(obj2.ilkHarf);

		Scope1 obj3 = new Scope1();
		obj3.isim="Ferdi";
		obj3.soyisim="Tayfur";
		obj3.izindeMi=true;
		System.out.println(obj3.isim +" " + obj3.soyisim + " " + obj3.izindeMi); // Ferdi Tayfur true
		

	}

	public static void staticMethod() {
		System.out.println("Static method calisti");
	}

	public void method() {
		
		System.out.println(sayi); // bu method static olmadigi icin instance variable'lara direkt erisebilir
		sayi=sayi+20; // ve bu method icerisinde gecerli olmak uzere degerini degistirebilir
		

	}

}
