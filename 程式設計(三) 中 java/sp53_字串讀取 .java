import java.util.*;
import java.math.BigDecimal;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	String s1[] = str.split(" ");
	/*for ( int i = 0; i < s1.length ; i++ ){
		System.out.println(s1[i]);
	}*/
	
	float sum1 = 0;
	float sum2 = 0;
	String s2[];
	for ( int i = 0; i < s1.length ; i++ ){
		s2 = s1[i].split(":");
		if ( Integer.valueOf(s2[0]) % 2 == 1  ){
			sum1 += Float.valueOf(s2[1]);
		}else{
			sum2 += Float.valueOf(s2[1]);
		}
	}
	
	System.out.println(new BigDecimal(String.valueOf(sum1)).subtract(new BigDecimal(String.valueOf(sum2))));
	}
}