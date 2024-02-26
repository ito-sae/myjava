package myjava;

public class MyJava2_2 {

	public static void main(String[] args) {
		 int aaa =100;
		 int bbb =50;
		 
		 System.out.println(sum(aaa,bbb));
		 System.out.println(Hikizan(aaa,bbb));
		 System.out.println(Kakezan(aaa,bbb));
		 System.out.println(Warizan(aaa,bbb));
			
		}
		
		
		public static int sum (int x,int y) {
			return x+y;
		}
		
		public static int Hikizan(int x,int y) {
			return x-y;
		}
		
		public static int Kakezan(int x,int y) {
			return x*y;
		}
		
		public static int Warizan(int x,int y) {
			return x/y;
		}

}
