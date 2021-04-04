package day05;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		
		// AND && , OR  ||
		// AND operatoru mükemmelliyetcidir. Hepsi true olursa sonucu true yapar
		// bir tane bile False olsa, false yapar.
		// matematiksel carpma islemi gibidir (true=1 false=0)
		boolean isTrue= 5>4 && 7-3>0;
		System.out.println(isTrue); // True
		
		int x=10;
		int y=5;
		
		System.out.println(x/y==2 && x*y>20 && x-y>0); // True
		System.out.println(x+y<0 && x-y>0); // False
		
		// OR operatoru ise optimisttir. Verilen karsýlastýrmalardan bir tanesi 
		// bile dogru ise sonuc True olur.
		// true 1 false 0 ise toplama islemi gibi düsünebiliriz
		
		System.out.println(x<y || x+y<0 || x*y>0);  // True
		
		
		
		
		
		
		

	}

}
