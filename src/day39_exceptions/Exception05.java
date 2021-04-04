package day39_exceptions;

import java.io.FileInputStream;

public class Exception05 {

	public static void main(String[] args) {
		//
		
		String str=" ";
		String str2="";
		String str3=null; // null bir deger degildir, sadece str3'un hicbir seye esit 
		                  // olmadigini soyleyen bir isaretcidir(pointer)
		
		System.out.println(str.length()); // 1
		System.out.println(str2.length()); // 0
		System.out.println(str3.length()); // NullPointerException
		
		System.out.println(str3 + "bos"); // nullbos
		
		System.out.println(str3.concat("bos")); // NullPointerException
	
	}
}
