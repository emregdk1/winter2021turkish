package day43_interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {
		
		// static olarak tanimlanmis bir variable veya method
		// baska class'tan classIsmi.methodIsmi seklinde cagirilabilir
		
		Interface02.deneme2();
		
		// default keyword'u ile olusturdugumuz method ise
		// obje uzerinden cagirilabilir
		
		InterfaceRunner obj1=new InterfaceRunner();
		obj1.deneme();
		

	}

}
