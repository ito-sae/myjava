package myjava;

public class MyJava2_4 {

	public static void main(String[] args) {
		
		Number number = new Number(50,100);
		System.out.println(number.sum());
		System.out.println(number.Hikizan());
		System.out.println(number.Kakezan());
		System.out.println(number.Warizan());
	}

}

class Number {
	private int aaa;
	private int bbb;
	
	public Number(int x, int y) {
		aaa=x;
		bbb=y;
	}
	
	public int sum() {
		return aaa+ bbb;
	}
	
	public int Hikizan() {
		return aaa -bbb;
	}
	
	public int Kakezan() {
		return aaa*bbb;
	}
	
	public int Warizan() {
		return aaa/bbb;
	}
}
