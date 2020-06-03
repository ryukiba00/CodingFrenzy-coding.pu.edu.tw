import java.util.*;
class Circle {
    private int radius;
    public Circle(int r){
    	radius = r;
    }
    public int getRadius(){
    	return radius;
    }
    public int getArea(){
    	return radius*radius;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Circle c1 = new Circle(r);
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea() + " PI.");
    }
}

