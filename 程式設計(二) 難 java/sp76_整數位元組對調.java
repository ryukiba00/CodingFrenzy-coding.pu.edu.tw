import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int a, b, c, d;
	a = n % 256;
	n /= 256;
	b = n % 256;
	n /= 256;
	c = n % 256;
	n /= 256;
	d = n % 256;
	n /= 256;
	
 	int ans = c + 256 * b + 256*256 * a + 256*256*256*d;
	
	System.out.printf("> 對調後 : %d\r\n", ans);
	}
}