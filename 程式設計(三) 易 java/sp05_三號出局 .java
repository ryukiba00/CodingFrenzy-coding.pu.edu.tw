import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int num[] = new int[n];
	for ( int i = 0; i < n ; i++ ){
		num[i] = i+1;
	}
	
	// 到3號叫號
	int count = 0;
	// 如果c不是1的話,重新迴圈
	int c = n;
	while ( c != 1 ){
		for ( int i = 0; i < n ; i++ ){
			if ( num[i] == 0){
				continue;
			}
			count += 1;
			if ( count == 3 ){
				num[i] = 0;
				count = 0;
				c -= 1;
			}
			if ( c == 1 ){
				break;
			}
		}
	}
	Arrays.sort(num);
	
	System.out.println(num[n-1]);
	}
}