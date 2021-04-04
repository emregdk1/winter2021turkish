package day43_interfaces;

public interface Interface01 {
	
	public void motor(); // interface icinde abstract method'lar ve
	                     // OZEL concrate method'lar olabilir 
	
	/*
	 Bir abstract method'un body'si olmadigindan o method'un istenen dinamik
	 ozelligi nasil gerceklestirecegini bilmemiz mümkün degildir
	 Sadece ne yapacagini biliriz
	 
	 Bu method bize sunu anlatir:
	 Beni inherit eden her concrete class'in dinamik motor ozelligi olmalidir
	 
	 */
	
	void vites(); // Beni inherit eden her concrete class'in dinamik vites ozelligi olmalidir
	abstract void kasa(); // Beni inherit eden her concrete class'in dinamik kasa ozelligi olmalidir
	
	// Interface'de sadece ABSTRACT, PUBLÝC method'lar olur 
	// bu iki keyword'u yazsak da yazmasak da, Java tum method'lari
	// bu sekilde kabul eder
	
	// Java'dan interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz
	// Bir class sonradan bazi keyword'ler yazilarak interface yapilamaz
	
	String ISIM="Mustafa"; // Java isim kelimesini italik ve bold yapti
	                       // demekki tum variable'lar final ve static'tir
	

}
