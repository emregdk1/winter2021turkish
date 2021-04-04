package day03;

public class C5_ArttirmaAzaltma {

	public static void main(String[] args) {
		
		int num = 15;
		// bir sayiyi 2 arttirmak istersek iki ile toplariz
		
		int num2 = num + 2;
		
		System.out.println("num2 = " + num2);
		System.out.println("num = " + num);
		
		num = num+5; 
		// esitligin  solunda num yazdigimizda esitligin sagindaki islemde
		// olusan num veriable'ina atanir. bu satirdan SONRA num=20 dir
		
		System.out.println("15.satirdan sonra num = " + num);
		
		System.out.println(num+12);
		
		// bir sayiyi arttirmak (increment) istersek o sayiya istedigimiz sayiyi
		// ekler ve sonra veriable'e ekleriz
		
		// num'i 8 arttirin
		
		num = num+8; // num=28
		
		// num'i 5 arttirin
		
		num +=5; // num=33
		
		System.out.println("Javanin pratik artirisindan sonra num= " + num);
		
		// num'i 10 arttiralim
		
		num +=10;
		
		// num'i 1 arttirin
		
		num +=1; // num=44
		
		// sadece 1 arttirmaya özel, Java pratik method
		
		num++; // num=45
		
		System.out.println("num'in son hali : "+ num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
