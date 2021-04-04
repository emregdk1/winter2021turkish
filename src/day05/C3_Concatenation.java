package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		// Concatenation (birlestirme) : Java'da birden fazla String'i + iþareti ile
		// toplarsaniz, Java bu Stringleri yanyana yazar
		
		String str1="Java";
		String str2="Guzeldir";
		
		System.out.println(str1+str2); // JavaGuzeldir
		// eger arada bosluk birakmak isterseniz
		
		System.out.println(str1+" "+str2); // Java Guzeldir
		
		System.out.println(str1+' '+str2);
		
		System.out.println(str2+str1);
		
		int sayi1=5;
		int sayi2=4;
		
		// verilen degiskenleri kullanarak colsolda 9 yazdirin
		
		System.out.println(sayi1+sayi2);
		
		System.out.println(sayi1+sayi2+str1+str2); // 9javaGuzeldir
		
		System.out.println(str1+str2+sayi1+sayi2); // JavaGuzeldir54
		
		// verilen de JavaGuzeldir1
		
		System.out.println(str1+str2+(sayi1-sayi2)); // JavaGuzeldir1
		
		// verilen degiskenlerle 9 JavaGuzeldir
		
		System.out.println(sayi1+sayi2+ " " + str1+str2);
		
		// Java, matematiksel bir islem yaparken, char data turunden bir degerle
		// karsilasirsa o charin ascii degerini alir.
		
		System.out.println(sayi1+sayi2+str1+' '+str2); // 9Java Guzeldir
		
		System.out.println(str1+str2+sayi1*sayi2); // JavaGuzeldir20
		
		// kural1 - eger toplanan degerlerden bir tanesi bile String ise Java
		// Toplama degil concatenation (Birlestirme)
		
		// kural2 - eger toplanan degerlerin ikisi de matemaktiksel islemse 
		// Java Toplar
		
		// kural3 - eger sayi ve String degiskenler birlikte kullanilacaksa
		// oncelikler belirlenip o islemler icin parantez kullanilir
		
		// kural4 - matemaktiksel bir islemde char degisken kullanilirsa, Java
		// nin ascii degeri isleme alinir
		
		// kural5- char bir degisken ile String bir degisken toplanirsa
		// concatenation olur

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
