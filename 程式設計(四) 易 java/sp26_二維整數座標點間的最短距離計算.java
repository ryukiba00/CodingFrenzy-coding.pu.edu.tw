import java.util.*;
import java.math.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int x[] = new int[n];
	int y[] = new int[n];
	for ( int i = 0 ; i < n ; i++ ){
		x[i] = sc.nextInt();
		y[i] = sc.nextInt();
	}
	
	double min = 100;
	double distance = 0;
	for ( int i = 0 ; i < n ; i++ ){
		for ( int j = i+1 ; j < n ; j++ ){
			distance = Math.sqrt((Math.pow(x[i]-x[j], 2 ) +  Math.pow(y[i]-y[j], 2 )));
			if ( distance < min ){
				min = distance;
			}
		}
 	}
		
	System.out.printf("%.1f",min);
	
	}
}