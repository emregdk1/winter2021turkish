package day33_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 class'indaki class member'a ulasmaya calisalim
		
		Encapsulation02 obj1= new Encapsulation02();
		
		// Biz erisim yetkisini ikiye ayiriyoruz
		// 1- okuyabilme get()
		// 2- degistirip kullanabilme set()
		
		System.out.println(obj1.sayi); // 100
		System.out.println(obj1.getOkulIsmi()); // Yildiz Koleji
		
		obj1.setHesapNo(546789);
		// Bir Calss i�inde class member olu�turuken bunu di�er class lar ile
		// ne oranda payla�aca��m�za karar veririz
		// 1- Herkes okuyabilsin ve obje �zerinden de�er atay�p kullanbilsin ==> public
		// 2 - Herkes okuyabilsin ama kimse obje izerinden de olsa de�i�tiremesin Private ==> Public get();
		// 3 - �lk atad���m de�eri kimse goremesin Private ==> Public set ()
		
		
		
		
		

	}

}
