import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	String s1 = sc.nextLine();
	String s2 = "0";
	int sum = 0;
	
	for ( int i = 0 ; i < s1.length() ; i++ ){
		if( (int)s1.charAt(i) > 47 && (int)s1.charAt(i) < 58 ){
			s2 = s2.concat(String.valueOf(s1.charAt(i)));
		}
		if ( (int)s1.charAt(i) < 48 || (int)s1.charAt(i) > 57 || i == s1.length()-1 ){
			sum += Integer.valueOf(s2);
			s2 = "0";
		}
	}
	
	System.out.print("ANS= "+sum);
	}
}