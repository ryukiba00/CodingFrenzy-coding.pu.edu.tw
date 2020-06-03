import java.util.Scanner;
abstract class TwoDShape {
	private double width;
	private double height;
	private String name;
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	String getName() {
		return name;
	}
	abstract double area();
}
class Triangle extends TwoDShape {
	Triangle(double w, double h) {
		super(w, h, "triangle");
	}
	/* 你的程式碼 */
	public double area(){
		return getWidth()*getHeight()/2;
	}
}
class Rectangle extends TwoDShape {
	Rectangle(double w, double h) {
		super(w, h, (w == h) ? "square" : "rectangle");
	}
	
	/* 你的程式碼 */
	public double area(){
		return getWidth()*getHeight();
	}
}
class main {
	public static void main(String args[]) {
		TwoDShape shapes[] = new TwoDShape[2];
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		
		shapes[0] = new Triangle(w, h);
		shapes[1] = new Rectangle(w, h);
		
		for(TwoDShape obj : shapes)
			System.out.println("The area of the " + obj.getName() + " is " + obj.area());
	}
}
