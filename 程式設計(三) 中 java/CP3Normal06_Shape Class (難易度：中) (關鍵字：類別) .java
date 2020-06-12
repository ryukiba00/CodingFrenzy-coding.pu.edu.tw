import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        Rectangle r1 = new Rectangle("gray", sc.nextDouble(),sc.nextDouble());
        System.out.println("The area of r1="+r1.calculateArea());
        System.out.println("The perimeter of r1="+r1.calculatePerimeter());
        Square s1 = new Square("red", sc.nextDouble());
        System.out.println("The area of s1="+s1.calculateArea());
        Circle c1 = new Circle("pink", sc.nextDouble());
        System.out.println("The area of c1="+c1.calculateArea());
        System.out.println("The perimeter of c1="+c1.calculatePerimeter());
    }
}

class Shape{
    public String color = "blue";
    public Shape(String color){
       this.color = color;
    }
    public double calculateArea(){ //計算面積
        return 0.0;
    }
    public double calculatePerimeter(){ //計算周長
        return 0.0;
    }
}
class Rectangle extends Shape{
    public double width;
    public double height;
    /* 你的程式碼 */
    Rectangle(String color, double width, double height){
    	super(color);
    	this.width = width;
    	this.height = height;
    }
    public double calculateArea(){ //計算面積
        return width * height ;
    }
    public double calculatePerimeter(){ //計算周長
        return (width + height)*2 ;
    }
}

class Circle extends Shape{
    public double radius;
    /* 你的程式碼 */
    Circle(String color, double radius){
    	super(color);
    	this.radius = radius;
    }
    public double calculateArea(){ //計算面積
        return radius * radius * Math.PI;
    }
    public double calculatePerimeter(){ //計算周長
        return   2 * radius * Math.PI;
    }
}
class Square extends Rectangle{
    /* 你的程式碼 */
    Square(String color,double side){
    	super(color,side,side);
    }
}

