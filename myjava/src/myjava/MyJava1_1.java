package myjava;

public class MyJava1_1 {

	public static void main(String[] args) {
		
		//課題1-1
		//文字列の代入、代入した値を入れ替える。
		
		String str1 = "aaa";
		String str2 = "bbb";
		
		String txt =str1;
		str1 =str2;
		str2 = txt;
		
		
		
		System.out.println(str1 + " " +str2);
	}

}
