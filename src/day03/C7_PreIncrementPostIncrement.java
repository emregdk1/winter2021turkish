package day03;

public class C7_PreIncrementPostIncrement {

	public static void main(String[] args) {
		
		int num = 20;
		num++; // num=21
		
		System.out.println(num); // 21
		System.out.println(num++); // 21 once yazdiriyor sonra arttiriyor Post
		System.out.println(num); // 22
		
		System.out.println(++num); // pre
		System.out.println(num);
		

	}

}
