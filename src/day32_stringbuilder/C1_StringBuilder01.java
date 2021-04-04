package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Rumeysa");
		System.out.println(sb1); // Rumeysa

		sb1.append(" ").append("Cetinturk"); // verilen SB'in sonuna istedigimiz degerleri eler
		System.out.println(sb1); // Rumeysa Cetinturk

		sb1.append("Javayi cok sever", 6, 10); // baska bir String'den istedigimiz bolumu SB'in sonuna ekler
												// baslangic index'i inclusive, bitis index'i exclusive'dir
		System.out.println(sb1); // Rumeysa Cetinturk cok

		System.out.println(sb1.length()); // 21 => SB'in uzunluk bilgisini verir
		System.out.println(sb1.capacity()); // 23 => SB'SB'in kapasite bilgisini verir

		sb1.charAt(5); // bize bilgi getiren method'lar SB'i degistirmez, bilgi getirir
		System.out.println(sb1.charAt(1)); // u => SB'in istedigimiz index'de olan karakterin bilgisini verir

		sb1.delete(17, 21); // SB'in istedigimiz index'leri arasindaki kismi siler
		System.out.println(sb1); // Rumeysa Cetinturk

		sb1.deleteCharAt(16); // SB'in istedigimiz index'teki karakteri siler
		System.out.println(sb1); // Rumeysa Cetintur
		
		String isim="Rumeysa Cetintur";
		sb1.equals(isim); // false 
		System.out.println(sb1.equals(isim)); // data turleri farklý oldugu icin icerigin kiyaslanmasi mümkün degildir
		
		StringBuilder sb2=new StringBuilder("Rumeysa Cetintur");
		System.out.println(sb1==sb2); // false
		System.out.println(sb1.equals(sb2)); // false => SB'da equals method'u String'den farkli calisir
		                                     // ancak ayni obje ile kiyaslandiginda true verir
		                                     // String'teki == gibi calisir
		
		System.out.println(sb1.equals(sb1)); // true
		
		sb1.indexOf("Cetin");
		System.out.println(sb1.indexOf("Cetin")); // 8 S'da arama yapar
		System.out.println(sb1.indexOf("e", 6)); // 9 istedigimiz index'ten sonrasinda arama yapar
		
		System.out.println(sb1.indexOf("Kazim")); // -1 aradigimiz String'i SB'da bulamazsa -1 döndürür
		
		sb1.insert(7, " "); // istedigimiz index'ten itibaren istenen String'i ekler
		System.out.println(sb1);
		
		String cumle="Merhaba dunya";
		sb1.insert(0, cumle, 0, 8); // 0 => SB'a hangi index'ten itibaren eklenecek
		                            // cumle => Hangi String'den eklenecek 
		                            // 0 => cumlenin hangi index'inden baslanacak
		                            // 8 => baslangic index'inden sonra kac karakter alinacak
		
		sb1.insert(25, cumle, 8, 13);
		
		System.out.println(sb1); // Merhaba Rumeysa Cetintur
		
		System.out.println(sb1.lastIndexOf("t")); // 22 => t'nin en son kullanildigi index
		System.out.println(sb1.lastIndexOf("a", 22)); // 14 => istenen index'ten oncesine bakar
		
		sb1.replace(8, 15, "Seher"); // SB'in baslangic ve bitis index'leri arasindaki
		                             // kismi, verilen String ile degistirir
		
		System.out.println(sb1); // Merhaba seher  Cetinturdunya
		
		sb1.reverse();
		System.out.println(sb1); // aynudrutniteC  reheS abahreM
		sb1.reverse();
		
		sb1.setCharAt(10, 'k');
		System.out.println(sb1); // Merhaba Seker  Cetinturdunya
		
	    System.out.println(sb1.subSequence(8, 13));  // Seker => SB'in istedigimz index'ler arasindaki bolumu verir
	    
	    System.out.println(sb1.substring(8)); // Seker Cetinturdunya
	                                          // baslangic index'inden sona kadar
	    
	    sb1.subSequence(8, 13);
	    System.out.println(sb1); // Merhaba Seker  Cetinturdunya
	    sb1.substring(8, 13);
	    System.out.println(sb1); // Merhaba Seker  Cetinturdunya
	    
	    StringBuilder sb3= new StringBuilder("Java cok güzel");
	    StringBuilder sb4= new StringBuilder("Java cok güzel");
	    
	    System.out.println(sb3.equals(sb4)); // false 
	    // iceriklerinin esit olup olmadigina bakmak icin String'deki equals method'una kullanalim
	    
	    System.out.println(sb3.toString().equals(sb4.toString()));
	    
	    sb3.toString().concat(" Insanin sevdikce sevesi geliyor");
	    // String class'ina ait method'lar kullaninca kalici degisiklik olmaz
	    System.out.println(sb3); // Java cok guzel
	    // toString() method'unu kullaninca SB String'e donusmus olur
	    // dolayisiyla tum String method'lari kullanilabilir
	    
	    System.out.println(sb3.toString().concat(" Insanin sevdikce sevesi geliyor"));
	    // Java cok güzel Insanin sevdikce sevesi geliyor
	    
	    System.out.println(sb1.length()); // 28
	    System.out.println(sb1.capacity()); // 48
	    sb1.trimToSize(); // SB icin hazirlanan kapasitedeki fazlaliklari siler
	                      // length ile kapasiteyi esit duruma getirir
	    
	    System.out.println(sb1.length()); // 28
	    System.out.println(sb1.capacity()); // 28
	    
	    System.out.println(sb3.compareTo(sb4));
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		

	}

}
