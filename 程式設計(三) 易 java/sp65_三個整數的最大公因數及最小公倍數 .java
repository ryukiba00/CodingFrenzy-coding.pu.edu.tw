import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	System.out.println( gcd(a, gcd( b,c ))+" "+lcm(a, lcm( b, c) ));
	}
	
	// 最大公因數, greatest common divisor
	public static int gcd( int a, int b ){
		if(b == 0) {
            return a; 
       }else{ 
            return gcd(b, a % b); 
       } 
	}
	// 最小公倍數, Least common multiple
	public static int lcm( int a, int b ){
		return a * b / gcd( a, b );
	}
}