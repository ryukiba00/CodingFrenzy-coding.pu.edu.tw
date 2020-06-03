import java.util.Scanner;
abstract class Circle {
	private final double x = 0;
	private final double y = 0;
	private double r;
	Circle(double r) {
		this.r = r;
	}
	public double getR() {
		return r;
	}
	abstract boolean inCircle(double x, double y);
}
class ChildCircle extends Circle {
    ChildCircle(double r){
    	super(r);
    }
    public boolean inCircle(double x, double y){
    	if ( x*x + y*y < getR()*getR() ){
    		return true;
    	}else{
    		return false;
    	}
    }
}
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		ChildCircle rc = new ChildCircle(r);
		System.out.println(rc.inCircle(x, y));
	}
}
