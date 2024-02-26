package myjava;

public class MyJava3 {

	public static void main(String[] args) {
		
		//長方形
		Rectangle rectangle =new Rectangle();
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		
		System.out.println();
		
		//円
		Circle circle = new Circle();
		System.out.println(circle.area());
		System.out.println(circle.perimeter());
		
		System.out.println();
		
		//正三角形
		Triangle triangle =new Triangle();
		System.out.println(triangle.area());
		System.out.println(triangle.perimeter());
		
	}

}

interface Shape {
	 
	 int area();
	 int perimeter();
	
}

class Rectangle implements Shape {
	private int vertical =10;
	private int beside =25;
	
	public int area() {
		
		return vertical*beside;
		
	}
	
	public int perimeter() {
		return vertical*2+beside*2;
	}
}

class Circle implements Shape {
	private int radius =15;
	private int circleratio =3;
	
	public int area() {
		return radius*radius*circleratio;
	}
	
	public int perimeter() {
		return radius*2*circleratio;
	}
}

class Triangle implements Shape {
	private double bottom =6.0;
	private double height =5.196;
	
	public int area() {
		return (int)(bottom*height/2);
	}
	
	public int perimeter() {
		return (int)(bottom*3);
	}
	
}