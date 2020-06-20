import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	// s[],儲存等下要輸入的字串
	String s[] = new String[n];
	int max = 0;
	for ( int i = 0 ; i < n ; i++ ){
		s[i] = sc.next();
		if ( max < s[i].length() ){
			max = s[i].length();
		}
	}
	
	int c = 0;
	int k = 0;
	for ( int i = 1 ; i <= max ; i++ ){
		c = 0;
		for ( int j = 0 ; j < n ; j++ ){
			if ( s[j].length() == i ){
				c += 1;
				if ( c == 1 ){
					System.out.print(i+" : ");
				}
				k = j;
				System.out.print(s[j]+" ");
			}
		}
		if ( c > 0){
			System.out.println();
		}
	}
	
	}
}