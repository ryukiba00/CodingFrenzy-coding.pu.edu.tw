import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	String str1 = sc.next();
	String str2 = sc.next();
	
	String s1[] = str1.split("/");
	String s2[] = str2.split("/");
	
	int b = lcm(Integer.parseInt(s1[1]),Integer.parseInt(s2[1]));	
	int a = Integer.parseInt(s1[0]) * b/Integer.parseInt(s1[1]) 
		  + Integer.parseInt(s2[0]) * b/Integer.parseInt(s2[1]);
		  
	System.out.println(a/gcd(a,b)+"/"+b/gcd(a,b));
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