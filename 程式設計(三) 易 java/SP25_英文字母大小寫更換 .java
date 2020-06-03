import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	String s = sc.nextLine();
	
	boolean b = false;
	for ( int i = 0; i < s.length() ; i++ ){
		if ( s.charAt(i) == '.' ){
			b = true;
		}
		if ( ( b == true && (int)s.charAt(i) > 96 && (int)s.charAt(i) < 123 )
		 ||  i == 1 || s.charAt(i) == 'I' ){
			System.out.print(Character.toUpperCase(s.charAt(i)));
			b = false;
		}else{
			System.out.print(s.charAt(i));
		}
	}
	
	}
}