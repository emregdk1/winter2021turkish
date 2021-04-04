package day41_erros_garbagelloctor;

public class Errors {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println(20/0); // RTE degil RunTimeException
		
		// String str="asd; // CTE dur... cunku cift tirnagi tamamlamadikca kod calismaz 
		// bu tur yazimdan kaynaklanan hatalar kolayca duzeltileblir
		
		// Java'da Error dendiginde onune gecilemeyen, kod ile cozulemeyen
		// sistemden kaynakli buyuk hatalar kastedilir
		
		// Error'lar unchecked'dir ve Java bunlari ongoremez
		// ancak gerceklestiginde kodun calismasini durdurulur
		
		String str="";
		for (int i = 0; i < 10000000; i++) {
			str+=i;
		}
		
		
		
		

	}

}
