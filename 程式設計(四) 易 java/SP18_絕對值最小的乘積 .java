import java.util.*;
import java.math.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int num[] = new int[5];
	for(int i = 0 ; i < 5 ; i++ ){
		num[i] = sc.nextInt();
	}
	
	int min = 100;
	for(int i = 0 ; i < 5 ; i++ ){
		for ( int j = i+1 ; j < 5 ; j++ ){
			if ( Math.abs(num[i]*num[j]) < min ){
				min = Math.abs(num[i]*num[j]);
			}
		}
	}
	System.out.println(min);
	}
}