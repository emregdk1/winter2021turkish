package day35_inheritance;

public class Memur extends Personel {
	
	public int maas;

	public Memur() {
		super();
		System.out.println("Child class parametresiz constructor calisti");
	}
	
	public Memur(int maas) {
		super("Seher", 6000);
		System.out.println("Child class parametreli constructor calisti");
		
	}



	/*
	 Inheritance'da cons. olusturdugumuzda Java'nin otomatik olarak cons'a
	    koydugu super(); keyWord onemlidir
	 super(); keyword default cons. gibidir, biz gormesekte calisir, ancak yerine
	    baska bir keyword yazarsak etkisiz hale gelir
	 *** extends varsa yerine bir sey yazmadikca super() calisir..... ***   
	 */

	public static void main(String[] args) {
		
		Memur obj1=new Memur(2400);
		

	}

	
		
	

}
