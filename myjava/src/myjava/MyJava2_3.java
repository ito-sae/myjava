package myjava;

public class MyJava2_3 {

	public static void main(String[] args) {
		
		//課題2-2
		//
		Item number = new Item();
		int a =50;
		int b =100;
		
		System.out.println(number.sum(a,b));
		System.out.println(number.Hikizan(a, b));
		System.out.println(number.Kakezan(a,b));
		System.out.println(number.Warizan(a, b));
	
		
	}

}

class Item {
	
	public static int sum (int x, int y) {
		return x+y;
	}
	
	public static int Hikizan (int x, int y) {
		return x-y;
	}
	
	public static int Kakezan (int x, int y) {
		return x*y;
	}
	
	public static int Warizan (int x, int y) {
		return x/y;
	}
}
