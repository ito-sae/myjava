package myjava;

public class MyJava1_2 {

	public static void main(String[] args) {
		
		//課題1-2
		//数値型の配列を2つ作成、反転し代入。
		
		
		int[] arr1 = {0,1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[10];
		
	
		for (int i =0;  i <arr1.length;i++) {
			arr2[i] = arr1[arr1.length-1-i];
		}
		
		for (int i: arr2) {
			System.out.println(i);
		}
	
	


		
		
		
		
		

	}

}
