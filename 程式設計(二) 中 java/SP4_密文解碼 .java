import java.util.Scanner;

public class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int temp = 0;
		for ( int i = 0; i < s.length() ; i++ ){
			temp = (int)s.charAt(i);
			if ( temp < 68 ){
				System.out.print((char)(temp + 23));
			}else{
				System.out.print((char)(temp - 3));
			}
		}
		System.out.println();
	}
}