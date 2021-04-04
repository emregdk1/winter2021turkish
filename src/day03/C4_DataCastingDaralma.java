package day03;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		
		double numDouble=131.56;
		
		int numInt= (int) numDouble;
		// double'dan int'e gecerken eger sayida ondalikli bolum varsa
		//java ondalikli bolumu siler yada  (yok sayar)
		
		System.out.println("int degiske degeri : " + numInt);
		
		byte numByte= (byte) numInt;
		// daha dar (narrow) bir data tipine cevirirken eger data tipinin sinirindan
		// buyukse negatif en kucuk sayidan devam eder, istenen sayiya gelinceye kadar
		// tekrar  tekrar en kucuk negatif sayiya gidier.
		
		System.out.println("byte degisken degeri : " + numByte);
		

	}

}
