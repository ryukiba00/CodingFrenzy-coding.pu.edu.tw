import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	String s1 = sc.nextLine();
	String s2 = "";
	String c = "";
	
	boolean b = false;
	for ( int i = 0; i < s1.length() ; i++ ){
		if ( ((int)s1.charAt(i) > 64 && (int)s1.charAt(i) < 91)||
				 ((int)s1.charAt(i) > 96 && (int)s1.charAt(i) < 123)){
				s2 = s2.concat(String.valueOf(s1.charAt(i)));
			}else{
				c = String.valueOf(s1.charAt(i));
				b = true;
			}
		if ( b == true ){
			for ( int j = s2.length()-1 ; j >= 0 ; j-- ){
				System.out.print(s2.charAt(j));
			}
			s2 = "";
			System.out.print(c);
			b = false;
		}
	}
	System.out.println();
	}
}