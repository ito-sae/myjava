package myjava;

public class MyJava1_4 {

	public static void main(String[] args) {
		
		//課題1-4
		//1から100までの要素を持つ配列、偶数を表示。
		int[] number =new int[100];
		
		for (int i =0; i < number.length;i++) {
			number[i] = i+1;
			
		}
		
		for (int x : number) {
			if (x % 2 == 0 ) {
				System.out.println(x);
				
			}
		}
		
	}
	
}
			
		


