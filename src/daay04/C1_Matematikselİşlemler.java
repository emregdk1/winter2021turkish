package daay04;

public class C1_Matematikselİşlemler {

	public static void main(String[] args) {
		
		int num1= 38 / 2 *( 4 + 3) * 2;
		
		System.out.println(num1); // 266
		
		int num2 = 8 + 2 * ( 14 - 6 / 2 ) - 12;
		
		System.out.println(num2); // 18
		
		int num3=10;
		
		double num4=num1 * num2 / num3; // 478.8
		// Java once esitligin sag tarafini yapar
		// bu ornekte sag tarafta tum degiskenler int oldugundan sonucu da int yapar
		// sonra assigment(atama) islemi yapilir
		
		System.out.println(num4);
		
		double num5=24.56;
		double num6=14.2;
		
		double num7= num5 / num6;
		
		System.out.println(num7);
		
		System.out.println(num5 / num3);
		
		double num8= (double) num1 * num2 / num3; // 478.8
		System.out.println(num8); // 478.8
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
