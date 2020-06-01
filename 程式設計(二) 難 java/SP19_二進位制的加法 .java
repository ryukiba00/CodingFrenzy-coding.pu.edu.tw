import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	int sum = a+b;
	int temp1 = sum;
	int temp2 = 0;
	int count = 1;	
	while ( temp1 != 0 ){
		if ( temp1 % 10 == 2){
			temp1 += 8;
			temp2 += 8*count;
		}
		temp1 /= 10;
		count *= 10;
	}
	sum += temp2;
	System.out.println(sum);

	}
}