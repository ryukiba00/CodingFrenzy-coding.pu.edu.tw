import java.util.Scanner;
import java.math.*;

abstract class Shape{
    String color;
    boolean filled;
    Shape(){}
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    //請定義兩個抽象方法
    abstract public double getArea();
    
    abstract public double getPerimeter();
}
class Circle extends Shape{
    double radius = 1.0;

    Circle(double radius, String color, boolean filled){
        //請完成建構子內容
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

     //請實作兩個抽象方法
    public double getArea(){
    	return Math.PI*radius*radius;
    }
    public double getPerimeter(){
    	return 2*Math.PI*radius;
    }
}

class Cylinder extends Circle{
    double height = 1.0;

    Cylinder(double radius, String color, boolean filled, double height){
        //請完成建構子內容
        super(radius, color, filled);
        this.height = height;
    }

    //請實作兩個抽象方法
    public double getHeight(){
    	return height;
    }
    public double getVolume(){
    	return getArea()*height;
    }
}

public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle(sc.nextDouble(), sc.next(), sc.nextBoolean());
        Cylinder cl1 = new Cylinder(sc.nextDouble(), sc.next(), sc.nextBoolean(), sc.nextDouble());

        System.out.println("The Area of c1:"+c1.getArea());
        System.out.println("The Perimeter of c1:"+c1.getPerimeter());
        System.out.println("The Volume of cl1:"+cl1.getVolume());
        System.out.println("The height of cl1:"+cl1.getHeight());
    }
}