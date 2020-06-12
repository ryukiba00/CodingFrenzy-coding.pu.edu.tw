import java.util.Scanner;
public class main {  
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    Shape shapes[] = new Shape[4];  
  
    double w1 = scn.nextDouble();
    double h1 = scn.nextDouble();
    shapes[0] = new Rectangle(w1, h1);
    shapes[1] = new Rectangle();
    ((Rectangle)shapes[1]).setWidth(10);  
    System.out.println("Is Shape 1 equal to Shape 2: " + shapes[0].equals(shapes[1]));
    System.out.println("Is the hash code of Shape 1 equal to that of Shape 2: " +
                    (shapes[0].hashCode() == shapes[1].hashCode()));
	
    double r = scn.nextDouble();
    shapes[2] = new Circle(r);  
    shapes[3] = new Circle();
    ((Circle)shapes[3]).setRadius(r);  
    System.out.println("Is Shape 3 equal to Shape 4: " + shapes[2].equals(shapes[3]));
    System.out.println("Is the hash code of Shape 3 equal to that of Shape 4: " +
                    (shapes[2].hashCode() == shapes[3].hashCode()));

    for(int i=0; i < shapes.length; i++) {
     System.out.println("The shape is a " + shapes[i].showStyle());
     if( shapes[i] instanceof Circle) {
      System.out.println("The radius is " + ((Circle)shapes[i]).getRadius());
     }
     else {
      System.out.print("The width is " + ((Rectangle)shapes[i]).getWidth());
      System.out.println(" and the height is " + ((Rectangle)shapes[i]).getHeight());
     }
     System.out.println("Area is " + shapes[i].area());   
     System.out.println("Circumference is " + shapes[i].circumference());  
    } 
  }  
}

abstract class Shape {
  private String style;  //record the shape type of this object, such as circle
  Shape(String style) {
    this.style = style;
  }
  //area returns the area of this object
  public abstract double area();
  //circumference returns the circumference of this object
  public abstract double circumference();
  //getStyle returns the style of this object
  public String showStyle() { return style; }
}

class Rectangle extends Shape{
/* 你的程式碼 */
	public double width;
	public double height;
	Rectangle(){
		super("rectangle");
		width = 0;
		height = 0;
	}
	Rectangle(double width, double height){
		super("rectangle");
		this.width = width;
		this.height= height;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getWidth(){
		return width;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	public boolean equals(Object obj){
		Rectangle q = new Rectangle();
		return width ==  q.getWidth() && height ==  q.getHeight();
	}
	public int hashCode(){
		return Double.hashCode(width) * 10 + Double.hashCode(height);
	}
	public double area(){
		return width * height;
	}
	public double circumference(){
		return (width + height) * 2;
	}
}

class Circle extends Shape{
/* 你的程式碼 */
	public double radius;
	Circle(){
		super("circle");
		radius = 0;
	}
	Circle(double radius){
		super("circle");
		this.radius = radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public boolean equals(Object obj){
		Circle q = (Circle)obj;
		return radius == q.getRadius();
	}
	public int hashCode(){
		return Double.hashCode(radius);
	}
	public double area(){
		return radius * radius * Math.PI;
	}
	public double circumference(){
		return radius * 2 * Math.PI;
	}
}
