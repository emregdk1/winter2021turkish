package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// Java'da saat ile islem yapmak icin LocalTime class'indan obje kullaniriz

		LocalTime saat = LocalTime.now();
		System.out.println(saat);

		for (int i = 0; i < 1000000; i++) {
			i += 1;
		}

		LocalTime saat2 = LocalTime.now();
		System.out.println(saat);
		System.out.println(saat);
		
		System.out.println(saat.plusHours(15)); // 12:45:51.991
		
		System.out.println(saat.getSecond());
		
		System.out.println(saat.minusSeconds(124124122)); // 08:01:37.902
		
		System.out.println(saat.now(ZoneId.of("America/Chicago"))); // 15:01:58
		
		
		
		

	}

}
