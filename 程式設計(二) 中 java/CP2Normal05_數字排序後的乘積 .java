import java.util.Scanner;
import java.util.Arrays;
/* 你的程式碼 */
class main{
	public static void main(String args[]){
	Scanner sc =  new Scanner(System.in);
	
	int num[] = new int[8];
	for( int i = 0; i < 8 ; i++ ){
		num[i] = sc.nextInt();
	}
	Arrays.sort(num);
	System.out.println(num[1]*num[6]);
	}
}