import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	String s = sc.next().toLowerCase();
	
	int sum = 0;
	for ( int i = 0 ; i < s.length() ; i++ ){
		if ( (int)s.charAt(i) < 97 || (int)s.charAt(i) > 122 ){
			System.out.print("Fail");
			System.exit(0);
		}else{
			sum += (int)s.charAt(i)-96;
		}
	}
	
	System.out.print(sum);
	}
}