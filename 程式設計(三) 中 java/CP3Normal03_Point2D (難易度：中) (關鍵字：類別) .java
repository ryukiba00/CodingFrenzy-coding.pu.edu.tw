import java.util.Scanner;

class Point2D {
    /* 你的程式碼 */
    public static int noOfPoints = 0;
    public double x;
    public double y;
    Point2D(double x, double y){
    	this.x = x;
    	this.y = y;
    	noOfPoints += 1;
    }
    public static int getNoOfPoints(){
    	return noOfPoints;
    }
    public String toString(){
  		return "(" + x + "," + y + ")";
  	}
    public double distanceFrom(Point2D q){
    	return Math.sqrt( Math.pow( x - q.x, 2 )+Math.pow( y - q.y, 2) );
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point2D pt1, pt2;
        pt1 = new Point2D(sc.nextDouble(), sc.nextDouble());
        pt2 = new Point2D(sc.nextDouble(), sc.nextDouble());

        System.out.println(pt1);
        System.out.println(pt2);
        System.out.println(pt1.distanceFrom(pt2));
        System.out.println(Point2D.getNoOfPoints());
    }
}
