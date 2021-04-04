package day27_arraylist;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);

		List<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(10);
		
        // equals() method'u 2 listeyi hem elemanlar hem de elemanlarin index'leri ile
		// karsilastirir, hem elemanlar hemde indexler esit ise true doner, yoksa false
		// doner
		System.out.println(list1.equals(list2)); // false
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1.equals(list2));
		
		list1.clear();
		System.out.println(list1); //  []
		
		

	}

}
