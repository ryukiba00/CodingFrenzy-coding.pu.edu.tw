import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	String s = String.valueOf(n);
	String ans = "";
	
	for ( int i = 0 ; i < s.length()/2 ; i++ ){
		if ( s.charAt(i) != s.charAt(s.length()-1-i) ){
			ans = "NO";
			break;
		}else{
			ans = "YES";
		}
	}
	
	int count = 0;
	for ( int i = 2 ; i <= n ; i++ ){
		if ( n % i == 0 ){
			count++;
		}
		if ( count > 1 ){
			ans = "NO";
			break;
		}
	}

	System.out.print(ans);
	}
}