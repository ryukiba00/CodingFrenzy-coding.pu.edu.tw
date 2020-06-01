import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int temp = 0;
	if ( b > a ){
		temp = b;
		b = a;
		a = temp;
	}
	
	System.out.printf("最大公因數:%d,最小公倍數:%d\r\n", gcd( a, b ) , lcm( a, b ) );
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