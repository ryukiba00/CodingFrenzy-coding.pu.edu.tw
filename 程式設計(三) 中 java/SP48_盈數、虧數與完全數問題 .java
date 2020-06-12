import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	String ans = "";
	
	int sum = 0;
	for ( int i = 1; i < n ;  i++){
		if ( n % i == 0 ){
			sum += i;
		}
	}
	if ( sum > n ){
		ans = "盈數";
	}else if ( sum < n ){
		ans = "虧數";
	}else{
		ans = "完全數";
	}
	
	System.out.println(ans);
	}
}