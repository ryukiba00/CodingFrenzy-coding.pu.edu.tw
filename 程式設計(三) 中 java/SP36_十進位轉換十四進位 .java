import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	String  s = "";
	
	int a = 0;
	char b = ' ';
	while (n!= 0){
		a = n % 14;
		if ( a > 9 ){
			b = (char)(65 + (a - 10));
		}else{
			b = (char)(48 + (a));
		}
		s = s.concat(String.valueOf(b));
		n /= 14;
	}
	
	for ( int i = s.length() - 1 ; i >= 0  ; i-- ){
		System.out.print(s.charAt(i));
	}
	System.out.println();
	}
}