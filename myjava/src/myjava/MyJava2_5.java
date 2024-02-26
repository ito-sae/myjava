package myjava;

public class MyJava2_5 {

	public static void main(String[] args) {
		//課題2-5
		
		Point zahyo = new Point();
		zahyo.x1 = 10;
		zahyo.y1 = 14;
		zahyo.x2 = 4;
		zahyo.y2 = 6;
		
		System.out.println(zahyo.zahyo2());
	}

}

class Point {
	int x1;
	int y1;
	int x2;
	int y2;
	
	public int zahyo2() {
		return (int)(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
	}
}
