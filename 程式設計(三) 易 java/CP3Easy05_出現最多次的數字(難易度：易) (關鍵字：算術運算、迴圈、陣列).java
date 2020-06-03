import java.util.Scanner;
import java.util.Arrays;

/* 你的程式碼 */
public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	String s = sc.nextLine();
	
	int count[] = new int [10];
	for ( int i = 0; i < 10 ; i++){
		count[i] = 0;
	}
	
	int k = 0;
	char temp = ' ';
	for ( int i = 0; i < s.length() ; i++ ){
		if ( (int)s.charAt(i) < 48 || (int)s.charAt(i) > 57 || s.charAt(i) == temp){
			continue;
		}else{
			temp = s.charAt(i);
			count[k]++;
		}
		for (int j = i+1 ; j < s.length() ; j++ ){
			if ( s.charAt(i) == s.charAt(j) ){
				count[k]++;
			}
		}
		k++;
	}
	Arrays.sort(count);
	
	System.out.println(count[9]);
	}
}